/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT02;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class LinkedListDice<T> implements ADT<T> {

    private int n;
    private LinkedList<Integer> list;
    
    public LinkedListDice(int n){
        this.n=n;
        list = new LinkedList<>();
        roll();
    }
    
    public void roll() {
       Random r = new Random();
       
       for(int i=0;i<n;i++){
           list.add(r.nextInt(6)+1);
       }
       
        System.out.println("\nLinked List Implementation: Roll "+n+"time(s)");
        for(Integer num : list){
            System.out.println(num+" ");
        }
    }
    
    
    public String toString(){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        
        return "\n Total is "+sum;
    }
    
}
