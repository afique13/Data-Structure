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
public class Q01d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(binary(73,""));
    }
    
    public static String binary(int num, String bin){ 
        if(num<=0)
            return bin;
        else{
            String bin_num = Integer.toString(num%2);
            return binary(num/2,bin+bin_num);
        }
    }
    
}
