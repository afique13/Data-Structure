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
    
    private int degree;
    private double coefficient;
    private static double ans=0.0;
    
    public Polynomial(int degree, double coefficient){
        this.degree=degree;
        this.coefficient=coefficient;
    }
    
    public void Answer(double x){
        ans = ans + coefficient*(pow(x,degree));
    }
    
    public static double getAnswer(){
        return ans;
    }
    
}
