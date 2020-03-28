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
        int [] notes = {100,50,20,10,5,1};
        int [] arr = new int[6];
        
        LinkedList<Integer> obj1 = new LinkedList<>();
        LinkedList<Integer> obj2 = new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            obj1.addNode(notes[i]);
        }
        arr = noNotes(amount,arr,obj1);
        for(int i=0;i<arr.length;i++){
            obj2.addNode(arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println("MYR "+obj1.get(i)+" : "+obj2.get(i));
        }
    }
    
    public static int[] noNotes(int amount,int[] arr,LinkedList<Integer> obj1){
        for(int i=0;i<arr.length;i++){
            arr[i] = amount/obj1.get(i);
            amount = amount - (obj1.get(i)*arr[i]);
        }
        
        return arr;
    }
    
}
