/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT04;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random a = new Random();
        int times = a.nextInt(21);
        LinkedList<Integer> obj1 = new LinkedList<>();
        for(int i=0;i<times;i++){
            obj1.randomNode();
        }
        System.out.println("Linked List has "+obj1.Length()+" node(s)");
        obj1.showlist();
        obj1.deleteNode(3);
        System.out.println(5/2);
    }
    
}
