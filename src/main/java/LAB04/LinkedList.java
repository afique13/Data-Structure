/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import TUT04.*;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class LinkedList <T extends Comparable<T>> {
    
    private ListNode head;
    
    public LinkedList(){
        head=null;
    }
    
    public int Length(){
        int count=0;
        ListNode currentNode = head;    
        while(currentNode!=null){
            currentNode=currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void addNode(T a){
//       double value = ((Number)a).doubleValue();
//        if(value>20)
//            value+=10.5;
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null)
            head = newNode;
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void showlist(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.println("");
    }
    
    public T get(int input){
        ListNode currentNode = head;
        int count=0;
        while(currentNode!=null){
            if(count==input){
                return (T) currentNode.getData();
            }
            currentNode= currentNode.getLink();
            count+=1;
        }
  
        return null;
    }
    
    public int sum(){
        ListNode currentNode = head;
        int sum=0;
        while(currentNode!=null){
            sum+=(Integer)currentNode.getData();
            currentNode=currentNode.getLink();
        }
        
        return sum;
    }
    
    public int EvenNumber(int length){
        ListNode currentNode = head;
        int count=0;
        for(int i=0;i<length;i++){
            if((Integer)currentNode.getData()%2==0)
                count++;
            currentNode=currentNode.getLink();
        }
        
        return count;
    }
    
    public void deleteSpecificNode(T element){
        ListNode currentNode = head;
        ListNode previousNode = head;
        while(currentNode.getLink()!=null){
            if(currentNode.getData().equals(element)){
                previousNode.setLink(currentNode.getLink());
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getLink();
        }
        
    }
    
    public void deleteFromNode(int node){
        ListNode currentNode = head;
        int count=1;
        while(currentNode!=null){
            if(count>=node-1){
                currentNode.setLink(null);
            }
            count++;
            currentNode = currentNode.getLink();
        }
    }
    
     public void deleteNode() {
        ListNode currentNode = head;
        ListNode previousNode = head;
        if (head != null) {
            if (currentNode.getLink() == null) {
                head = null;
            } else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        } else {
            System.out.println("List is empty");
        }
    }
    
    public void deleteFrontNode(){
        if(head!=null)
            head=head.getLink();
        // Replaces the front node with the adjacent node
    }
    
    public void randomNode(){
        Random read = new Random();
        int a = read.nextInt(21);
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null)
            head = newNode;
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void addFrontNode(T a){
        head = new ListNode(a,head);
    }
    
    public void SortNode(T a){
        ListNode newNode = new ListNode(a,null);
        boolean check=false;
        if(head==null){
            addNode(a);
        }else{
            T currentNodeData = (T) head.getData();
            if(a.compareTo(currentNodeData)<0)
                addFrontNode(a);
            else{
                ListNode currentNode = head;
             if(currentNode.getLink()!=null){   
        while(currentNode.getLink()!=null){        
                if(a.compareTo((T)currentNode.getLink().getData())<0){
                    ListNode lowerNode = new ListNode(a,currentNode.getLink());
                    currentNode.setLink(lowerNode);
                    check = true;
                    break;
                }else{
                    currentNode=currentNode.getLink();
                }
        }
            }
             if(check==false)
                    currentNode.setLink(newNode);
            }
        }
    }
    
    // munir's method
    public void addSortNode(T t) { 
        if (head == null) { //if there's nothing on the linked
            addNode(t);
        } else {
            T currentNodeData = (T) head.getData();
            if (t.compareTo(currentNodeData) < 0) {
                addFrontNode(t);
            } else {
                ListNode currentNode = head;
                T number;
                while (true) {
                    //System.out.println(t + " " + number);
                    if(currentNode.getLink() != null) {
                        if (t.compareTo((T)currentNode.getLink().getData()) < 0) {
                            ListNode newNode = new ListNode(t, currentNode.getLink());
                            currentNode.setLink(newNode);
                            break;
                        } else { // move to the next node
                            currentNode = currentNode.getLink();
                            number = (T) currentNode.getData();
                        }
                    } else { // add to the last element
                        ListNode newNode;
                        newNode = new ListNode(t, null);
                        currentNode.setLink(newNode);
                        break;
                    }

                }

            }
        }
    }
    
    public void removeAtIndex(int index){
          if (index >= Length() || index < 0 || head == null) {
            return;
        } else if (index == 0) {
            deleteFrontNode();
        } else if (index == Length()-1) {
            deleteNode();
        } else {
            int count = 0;
            ListNode currentNode = head;
            while (currentNode.getLink() != null) {
                if (count == index - 1) {
                    break;
                } else {
                    currentNode = currentNode.getLink();
                    count++;
                }
            }
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
        }
    }
    
    public void splitList(){
        ListNode currentNode = head;
        LinkedList sec_list = new LinkedList<>();
        int index,count=0;
        if(Length()%2==0)
            index = Length()/2;
        else
            index = Length()/2 +1;
        
        while(currentNode!=null){
            if(count>=index-1){
                sec_list.addNode((T)currentNode.getData());
            }
            currentNode = currentNode.getLink();
            count++;
        }
        deleteFromNode(index);
        System.out.print("First List : ");
        showlist();
        System.out.print("Second list : ");
        sec_list.showlist();
    }
    
    public void alternateNodes(){
        
    }
    
    public LinkedListIterator listIterator() {
        return new LinkedListIterator();
        //keyword "new" is used to create a new object
    }
    
    private class LinkedListIterator<T> implements Iterator<T>{

       private ListNode<T> currentNode = head;
        private int count = -1;

        @Override
        public boolean hasNext() {
            count++;
            return currentNode != null;
        }

        @Override
        public T next() {
            T data = (T) currentNode.getData();
            currentNode = currentNode.getLink();
            return data;
        }

        @Override
        public void remove() {
            removeAtIndex(count);
            count--;
        }
        
    }
}
