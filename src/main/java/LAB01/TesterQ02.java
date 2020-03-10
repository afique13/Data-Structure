/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01;

/**
 *
 * @author Owner
 */
public class TesterQ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polynomial[] poly= new Polynomial[4];
        
       int [] degree = {3,2,1,0};
       double [] coefficient = {4.0,2.0,-0.5,-20.0};
       double x=2.0;
       
        System.out.print("The polynomial is ");
        
        for(int i=0;i<poly.length;i++){
            poly[i] = new Polynomial(degree[i],coefficient[i]);
        }
        
        if(coefficient[0]>0)
            System.out.print(coefficient[0]+"x^"+degree[0]+" ");
        else
            System.out.print("-"+coefficient[0]+"x^"+degree[0]+" ");
        
        for(int i=1;i<poly.length;i++){
            if(coefficient[i]>0 && degree[i]!=0)
                System.out.print("+"+coefficient[i]+"x^"+degree[i]+" ");
            else if(coefficient[i]<0&&degree[i]!=0)
                System.out.print(coefficient[i]+"x^"+degree[i]+" ");
            else if(coefficient[i]<0&&degree[i]==0)
                System.out.println(coefficient[i]);
            else
                System.out.println("+"+coefficient[i]);
        }
        
        System.out.println("when x = "+x);
        
        
        for(int i=0;i<poly.length;i++){
            poly[i].Answer(x);
        }
        
        System.out.print("The answer is "+Polynomial.getAnswer());
        
    }
    
}
