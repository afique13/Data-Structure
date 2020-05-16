/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05;

import java.util.LinkedList;

/**
 *
 * @author Owner
 */
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("the candies in the container:");
        Stack<String> candy = new Stack<>();
        
        candy.push("Blue");
        candy.push("Yellow");
        candy.push("Yellow");
        candy.push("Orange");
        candy.push("Blue");
        candy.push("Red");
        candy.push("Orange");
        candy.showStack();
        System.out.println("Ali takes all the candies one by one from the container and eats the blue ones.");
        System.out.println("He puts back the rest in the container:");
        System.out.println("The candies in the container:");
        
        LinkedList<String> candies = new LinkedList<>();
        int count=candy.getSize();
        
        for(int i=0;i<count;i++){
            if(candy.peek().equals("Blue")){
                candy.pop();
                continue;
            }
            candies.add(candy.pop());
        }
        for(int i=0;i<candies.size();i++){
            candy.push(candies.get(i));
        }
        
        candy.showStack();
    }
    
}
