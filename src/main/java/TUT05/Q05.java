/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT05;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the parantheses: ");
        Scanner read = new Scanner(System.in);
        String parantheses = read.next();
        LinkedList<Character> para = new LinkedList<>();
        
        for(int i=0;i<parantheses.length();i++){
            para.add(parantheses.charAt(i));
        }
        
        boolean flag =false;
        int i=0;
        while(true){
            
            if(para.isEmpty())
                break;
            else if(para.get(0)==')'){
                flag=false;
                break;
            }
            else if(parantheses.length()%2!=0){
                break;
            }
            else if(para.get(i)=='('){
                for(int j=i;j<para.size();j++){
                    if(para.get(j)==')'){
                        para.remove(i);
                        para.remove(j-1);
                        flag =true;
                        break;
                    }else
                        flag=false;
                } 
            }
            
            if(flag==true)
                    i=0;
                else
                    i++;

        }
        
        if(flag==true)
            System.out.println(parantheses+" is balanced");
        else
            System.out.println(parantheses+" is not balanced");
        
        
    }
    
}
