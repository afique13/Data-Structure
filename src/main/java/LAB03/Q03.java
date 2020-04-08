/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

import java.util.Random;
import java.util.Scanner;

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
        Scanner a = new Scanner(System.in);
        Random b = new Random();
        System.out.print("Enter number of elements: ");
        int count = a.nextInt();
        System.out.print("The elements of the array: ");
        int [] num = new int[count];
        for(int i=0;i<num.length;i++){
            num[i] = b.nextInt(10);
            System.out.print(num[i]);
        }
        System.out.println("");
        int newcount = count;
        for(int i=count;i>1;i--){
            newcount*=(i-1);
        }
        
        Permutation(num,newcount,count,0);
    }
    
    public static void Permutation(int[] num, int newcount,int count,int temp){
            int [] array1 = new int[count];
            int [] array2 = new int[count];
            for(int i=0;i<num.length;i++){
                array1[i]=num[i];
            }
            for(int i=0;i<(newcount/count);i++){
                System.out.print(num[temp]);
                for(int j=0;j<count;j++){
                    if(j==temp)
                        continue;
                    if(i==0)
                    System.out.print(array1[j]);
                    else
                        System.out.print(array2[j]);
                }
                
                for(int j=0;j<count;j++){
                    if(j==temp)
                        continue;
                    else if(temp==0&&j==num.length-1)
                        array2[num.length-1]=array1[1];
                    else if(temp==0)
                        array2[j]=array1[j+1];
                    else if((j==temp-1)&&(j==num.length-2)&&temp!=0)
                        array2[j]=array1[0];
                    else if(j==temp-1&&temp!=0)
                        array2[j]=array1[j+2];
                    else if(j==num.length-1)
                        array2[j]=array1[0];
                    else
                        array2[j]=array1[j+1];
                }
                
                for(int j=0;j<num.length;j++){
                    array1[j] = array2[j];
                }
                System.out.println("");
            }
            
            if(temp<num.length-1)
                Permutation(num,newcount,count,(temp+1));
    }
    
    
    
}
