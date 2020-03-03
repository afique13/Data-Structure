/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01;

import static java.lang.Math.pow;
import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class Polynomial {
    
    private static int degree;
    private static double coefficient;
    private static double total=0;
    
    public Polynomial(int degree,double coefficient){
        this.degree=degree;
        this.coefficient=coefficient;
    }
    
    public static void calTotal(double x){
        total = total + coefficient*(pow(x,degree));
    }
    
    public static double getTotal(){
        return total;
    }
    
    public String toString(){
        DecimalFormat co = new DecimalFormat("#.#");
        String str = co.format(coefficient);
        return str+"x^"+degree;
    }
}
