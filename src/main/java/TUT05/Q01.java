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
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Stack Implementation using Linked List");
        System.out.println("Insert three nodes into the stack");
        Stack<Character> linkedlist = new Stack<>();
        linkedlist.push('A');
        linkedlist.push('N');
        linkedlist.push('D');
        linkedlist.showStack();
        System.out.println("Pop one node from the stack");
        linkedlist.pop();
        linkedlist.showStack();
        System.out.println("The element on top of the stack is "+linkedlist.peek());
        linkedlist.showStack();
        System.out.println("The number of elements in the stack is "+linkedlist.getSize());
    }
    
}
