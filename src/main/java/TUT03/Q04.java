/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT03;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
                String sen = a.next();
         try{
        if(sen.length()>12)
            throw new Exception("Length of string has exceeded the limit");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
