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
public class Q01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {2,5,7,8,2};
        System.out.println("sum = " + sum(arr,5));

    }
    
    public static int sum(int[] arr,int j){
        if(j<=0){
            return 0;
        }
        return arr[j-1] + sum(arr, j-1);  
    }
    
}
