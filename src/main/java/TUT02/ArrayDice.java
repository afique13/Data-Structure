/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT02;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class ArrayDice implements ADT{
    private int [] arr;
    private int n;
    
    public ArrayDice(int n){
        this.n=n;
        arr = new int[n];
        roll();
    }
    
    @Override
    public void roll() {
       Random r = new Random();
       for(int i=0;i<n;i++){
           arr[i] = r.nextInt(6)+1;
       }
       
        System.out.println("\nArray Implementation Roll "+n+" time(s)");
        for(Integer num : arr){
            System.out.print(num+" ");
        }
    }
    
    @Override
    public String toString(){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        return "\nTotal is "+sum;
    }
    
}
