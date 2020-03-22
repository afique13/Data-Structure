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
public class Q01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min=100;
        int [] num = {4,3,6,1,5,9};
        System.out.println(small2(0,num,min));

    }
    
    public static void small1(int i,int[] num,int min){ 
        
            if(num[i]<min)
                min=num[i];
            
            i+=1;
            if(i<num.length){
            small1(i,num,min);
            }else
                System.out.println(min);
            
    }
    
    public static int small2(int i,int[] num,int min){ 
        
            if(num[i]<min)
                min=num[i];
            
            i+=1;
            if(i<num.length){
              return small2(i,num,min);
            }else
                return min;
            
    }
    
}
