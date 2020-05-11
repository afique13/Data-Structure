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
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Stack implementation using Array");
        ArrayStack<Integer> array = new ArrayStack<>();
        for(int i=0;i<12;i++){
            array.push(i);
        }
        array.showStack();
        System.out.println("Pop one node from the stack");
        array.pop();
        array.showStack();
        System.out.println("The element on the top of the stack is "+array.peek());
        array.showStack();
        System.out.println("The number of elements in the stack is "+array.getSize());
    }
    
}
