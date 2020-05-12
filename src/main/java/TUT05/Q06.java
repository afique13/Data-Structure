/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT05;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random a = new Random();
        System.out.print("The random numbers are: ");
        int [] random = new int[10];
        for(int i=0;i<random.length;i++){
            random[i]=a.nextInt(101);
            if(i==0&&random[i]%2!=1)
                i=i-1;
        }
        
        for(int i=0;i<random.length;i++){
            System.out.print(random[i]+" ");
        }
        
        Stack<Integer> rando = new Stack<>();
        for(int i=0;i<random.length;i++){
            if(i==0)
                rando.push(random[i]);
            else if(i%2!=0){
                for(int j=1;j<random.length;j++){
                    if(random[j]%2==0&&random[j]!=-1){
                        rando.push(random[j]);
                        random[j]=-1;
                        break;
                    }
                }
            }else if(i%2==0){
                for(int j=1;j<random.length;j++){
                    if(random[j]%2!=0&&random[j]!=-1){
                        rando.push(random[j]);
                        random[j]=-1;
                        break;
                    }
                }
            }
        }
        
        System.out.print("\nThe numbers in the stack : ");
        rando.showStack();
        System.out.println("The numbers remaining in the array : "+rando.getSize());
    }
    
}
