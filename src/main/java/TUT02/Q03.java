/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT02;

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
        int a=12,b=8,c=38;
        System.out.println("Maximum: "+getMax(a,b,c));
        double d=12.0,e=8.0,f=38.2;
        System.out.println("Maximum: "+getMax(d,e,f));
    }
    
    public static <T extends Comparable<T>> T getMax(T a,T b,T c){
     
        T d;
        if(a.compareTo(b)>0)
            //returns positive integer if a is larger than b
            d=a;
        else 
            //returns negative integer if a is smallee than a
            d=b;
                    
        if(c.compareTo(d)>0)
            d=c;
        
        return d;
        
    }
    
}
