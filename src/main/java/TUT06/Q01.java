/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT06;

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
        System.out.println("Queue Implementation using Linked List");
        System.out.println("Enqueue three nodes");
        Queue<Character> queue = new Queue<>();
        queue.enqueue('B');
        queue.enqueue('M');
        queue.enqueue('W');
        queue.showQueueHorizontal();
        System.out.println("Dequeue one node");
        queue.dequeue();
        queue.showQueueHorizontal();
        System.out.println("The front node of the queue is "+queue.peek());
        System.out.println("The queue size is "+queue.getSize());
    }
    
}
