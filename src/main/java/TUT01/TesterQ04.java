/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT01;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class TesterQ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smartphone first = new Smartphone(" " , 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phones price :");
        System.out.println("Iphone : ");
        double iphone = input.nextDouble();
        System.out.println("Samsung : ");
        double samsung = input.nextDouble();
        System.out.println("Nokia : ");
        double nokia = input.nextDouble();
        System.out.println("LG : ");
        double lg = input.nextDouble();
        
        String[] phone = {"Iphone" , "Samsung" , "Nokia" , "LG"};
        double[] price = {iphone , samsung , nokia , lg};
        System.out.println("\nList of the SmartPhones :");
        
        for(int i=0 ; i<4 ; i++){
            System.out.print(phone[i] + " (RM" + price[i] + "), ");
        }
        System.out.println();
        
        Smartphone[] obj = new Smartphone[4];
        
        for(int i=0 ; i<4 ; i++){
            obj[i] = new Smartphone(phone[i] , price[i]);
        }
        
        double [] ordered_price = new double[4];
        ordered_price = first.compare(price);
        
        System.out.println("\nList of the SmartPhones in ascending order : ");
        for(int i=0 ; i<4 ; i++){
            System.out.print(phone[i] + " (RM" + ordered_price[i] + "), ");
        }
    }
    }
    

