/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT04;

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
//        double value = ((Number)a).doubleValue();
//        if(value>20)
//            value+=10.5;
        int value =((Number)a).intValue();
        ListNode newNode = new ListNode(value,null);
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
    }
    
    
}
