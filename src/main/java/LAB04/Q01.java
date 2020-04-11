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
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random a = new Random();
        int [] num = new int[10];
        for(int i=0;i<num.length;i++){
            num[i] = a.nextInt(41);
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        LinkedList<Integer> sort1 = new LinkedList<>();
        LinkedList<Integer> sort2 = new LinkedList<>();
        LinkedList<Integer> sort3 = new LinkedList<>();
        
        for(int i=0;i<num.length;i++){
            sort1.addNode(num[i]);
            sort2.addFrontNode(num[i]);
            sort3.SortNode(num[i]);
        }
        
        sort1.showlist();
        sort2.showlist();
        sort3.showlist();
    }
    
}
