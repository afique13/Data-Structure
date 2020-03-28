/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT04;

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
    
    public void deleteNode(T num){
        ListNode currentNode = head;
        boolean check = false;
        while(currentNode!=null){
            if(currentNode.getData()==num){
                check=true;
                System.out.println(num+" has been deleted");
                currentNode.setData(null);
                break;
            }
            currentNode = currentNode.getLink();
        }
        
        if(check==false)
            System.out.println("User input is not in the linked list");
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
    
    public void frontNode(T a){
        head = new ListNode(a,head);
    }
       
}
