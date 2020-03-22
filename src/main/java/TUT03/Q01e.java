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
public class Q01e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int n = 3;
        System.out.println("Sum of first " + n        + " cubes is " + sumCubes(n));
    }
    
    public static int sumCubes(int n){
        if (n == 0){
            return 0;
        } else {
            return (n*n*n) + sumCubes(n - 1);
        }
    }

    
}
