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
public class Q01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println(GCD(36,60));
    }
    
    public static int GCD(int x, int y){
    if(y == 0){
        return x;
    }
    else{
        return GCD(y,x%y);
    }
    }
        
}
