/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

/**
 *
 * @author Owner
 */
public class DoubleLinkedList<T extends Comparable> {
    
    DoubleListNode first;
    
    public int length(){
        DoubleListNode currentNode = first;
        int count=0;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.nextLink();
        }
        
        return count;
    }
    
    public void add(T data){
        if(first==null)
            first = new DoubleListNode(data,null,null);
        else{
            DoubleListNode currentNode = first;
            while(currentNode.nextLink()!=null){
                currentNode = currentNode.nextLink();
            }
            currentNode.setNextLink(new DoubleListNode(data,null,currentNode));
            //To set the current link, you need to call the previous link from the next link
        }
    }
    
    public DoubleListNode<T> get(int index) {
        DoubleListNode currentNode = first;
        if (index < 0 || index >= length()) {
            throw new IllegalArgumentException();
        } else {
            int count = 0;
            while (currentNode != null) {
                if (count == index) break;
                currentNode = currentNode.nextLink();
                count++;
            }
        }
        return currentNode;
    }
    
     public void removeAtIndex(int index) {
        DoubleListNode currentNode = first;
        if (index < 0 || index >= length()) {
            throw new IllegalArgumentException();
        } else if (index == 0) { // First node
            currentNode.nextLink().setPreviousLink(null);
            currentNode = currentNode.nextLink();
            first = currentNode;
        } else if (index == length() - 1) {
            while (currentNode.nextLink() != null) currentNode = currentNode.nextLink();
            currentNode.previousLink().setNextLink(null);
        } else {
            for (int i = 0; i < index; i++) 
                currentNode = currentNode.nextLink();
            currentNode.previousLink().setNextLink(currentNode.nextLink());
            //eg. index = 3 so 3 = 4
            currentNode.nextLink().setPreviousLink(currentNode.previousLink());
            //eg. index = 3 so 3 = 2
        }
    }
     
     public void remove(T data) {
        DoubleListNode<T> currentNode = first;
        int count = 0;
        while (currentNode != null) {
            if (currentNode.getData().compareTo(data) == 0) 
                break;
            currentNode = currentNode.nextLink();
            count++;
        }
        removeAtIndex(count);
    }
     
     public void set(int index, T data) {
        DoubleListNode currentNode = first;
        if (index < 0 || index >= length()) {
            throw new IllegalArgumentException();
        } else {
            int count = 0;
            while (currentNode != null) {
                if (count == index) 
                    break;
                currentNode = currentNode.nextLink();
                count++;
            }
            currentNode.setData(data);
        }
    }

    public void showList() {
        DoubleListNode currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.nextLink();
        }
        System.out.println();
    } 
}
