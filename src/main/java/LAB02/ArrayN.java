/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB02;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class ArrayN {
    
    private int [] num;
    private int size;
    
    public ArrayN(int size) {
        num=new int[size];
    }
    
    public int[] addValue(){
        Random r = new Random();
        int max=20;
        int count=1;
        boolean check;
        while(count<20){
            check=true;
            int temp=r.nextInt(101);
            for(int j=0;j<count;j++){
                if(temp==num[j])
                    check=false;
            }
            if(check==true){
                num[count]=temp;
                count++;
            }
        }
        return num;
    }
    
    public String sort(){
        System.out.println("Array Implementation");
        num = addValue();
        String str = "";
        int temp;
        for(int i=1;i<num.length;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                temp = num[j];
                num[j] = num[j+1];
                num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            str+=num[i]+" ";
        }
        return str;
    }
    
    public String toString(){
        return "Array Implementation\n"+sort();
    }

    
}
