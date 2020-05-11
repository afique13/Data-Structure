/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT05;

/**
 *
 * @author Owner
 */
public class ArrayStack<T> {
    private ListNode head;
    
    public ArrayStack(){
        head=null;
    }
    
    public boolean isFull(){
        return (getSize()>=10);
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    
    public int getSize(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode!=null){
            currentNode =currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void push(T a){
        if(!isFull())
        head = new ListNode(a, head);
    }
    
    public T pop(){
        if(head==null)
            return null;
        T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    
    public T peek(){
        if(head==null)
            return null;
        else
            return (T) head.getData();
    }
    
    public void showStack(){
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            ListNode currentNode = head;
            while(currentNode!=null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
            System.out.println("");
        }
            
    }
}
