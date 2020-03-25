/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT04;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> money = new LinkedList<>();
        System.out.print("Enter the total amount: ");
        Scanner a = new Scanner(System.in);
        int amount = a.nextInt();
        System.out.println("Total amount: "+amount);
        money.addNode(100);
        money.addNode(50);
        money.addNode(20);
        money.addNode(10);
        money.addNode(5);
        money.addNode(1);
        
    }
    
}
