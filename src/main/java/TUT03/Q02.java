/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT03;

/**
 *
 * @author Owner
 */
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Acker(3,4));
        System.out.println(Acker(2,5));
    }
    
    public static int Acker(int m, int n){
        if(m==0)
            return n+1;
        else if(n==0)
            return Acker(m-1,1);
        else{
            return Acker(m-1,Acker(m,n-1));
        }
    }
    
}
