/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT05;

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
        Scanner read = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = read.nextInt();
        Stack<Integer> fibonacci = new Stack<>();
        
        for(int i=1;i<=N;i++){
            if(i<=2)
                fibonacci.push(1);
            else{
                int a = fibonacci.pop();
                int b = fibonacci.pop();
                fibonacci.push(b);
                fibonacci.push(a);
                int c = a+b;
                fibonacci.push(c);
            }
            
            
        }
        
        System.out.println("Fib("+N+") : "+fibonacci.peek());
    }
    
}
