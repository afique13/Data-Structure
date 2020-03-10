/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT01;

/**
 *
 * @author Owner
 */
public class Smartphone implements Comparable{
    
    private String phone;
    private double price;

     Smartphone(String phone, double price) {
        this.phone = phone;
        this.price = price;
    }

    public double getPrice(double price) {
        return price;
    }
  
   
    @Override
    public double[] compare(double[] a){
       
        int check = 1; 
        double temp;
        
        while(check != 0){
            check = 0;
            for(int i=0 ; i<3 ; i++){
                if(getPrice(a[i])>getPrice(a[i+1])){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    check = 1;
                }
            }
            
            if(check == 0)
                break;
        }
        
        return a;
    }
    
    public void display(){
        System.out.print(phone + " (RM" + price + "), ");
    }
    
}
