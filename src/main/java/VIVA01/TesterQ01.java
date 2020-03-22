/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIVA01;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class TesterQ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Integer> a = new ArrayList<>(4);
        ArrayList<Integer> b = new ArrayList<>(4);
        a.add(1);
        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.add(6);
        b.add(1);
        b.add(2);
        b.add(5);
        b.add(9);
         b.add(13);
        Set<Integer> set = new Set<>(4,a,b);
         System.out.println(set.cardinality(a));
         System.out.println(set.toString(a));
         System.out.println(set.toString(b));
         System.out.println(set.Intersect());
        System.out.println(set.union());
        if(set.isSubset(a)==true){
            System.out.println("Set A is a subset of Set B");
        }else
            System.out.println("Set A is not a subset of set B");
//        System.out.println(set.isSubset(a,b));
        
    }
    
}
