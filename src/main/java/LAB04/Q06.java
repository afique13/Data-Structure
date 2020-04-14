/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        Random random = new Random();
        int randomNumber;
        System.out.print("The random numbers are : ");
        for (int i = 0; i < 10; i++) {
            randomNumber = random.nextInt(101);
            System.out.print(randomNumber + " ");
            doubleLinkedList.add(randomNumber);
        }
        System.out.println();
        System.out.println("Insert the random numbers into a doubly linked list");
        doubleLinkedList.showList();
        System.out.println("Remove a number from the third position");
        doubleLinkedList.removeAtIndex(2);
        doubleLinkedList.showList();
        System.out.println("Replace the number in seventh position with 999");
        doubleLinkedList.set(6, 999);
        doubleLinkedList.showList();
        System.out.println("Remove all even number from the doubly linked list");
        int number;
        for (int i = 0; i < doubleLinkedList.length(); i++) {
            number = (int) doubleLinkedList.get(i).getData();
            if (number % 2 == 0) {
                doubleLinkedList.removeAtIndex(i);
                i--;
            }
        }
        doubleLinkedList.showList();
    }
    
}
