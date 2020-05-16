/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT06;

import LAB05.Stack;


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
        Stack<String> word = new Stack<>();
        word.push("race car");
        word.push("civic");
        word.push("Was it a car or a cat I saw?");
        word.push("Welcome");
        word.push("kayak");
        Queue<Character> palindrome = new Queue<>();
        int count1 = word.getSize();
        for(int i=0;i<count1;i++){
            String reverse = "";
            for(int j=word.peek().length()-1;j>=0;j--){
               palindrome.enqueue(word.peek().charAt(j));
            }
            int count2 = palindrome.getSize();
            for(int j=0;j<count2;j++){
                reverse += palindrome.dequeue();
            }
            String stack_word = word.pop();
            if(reverse.equals(stack_word))
                System.out.println(stack_word+" is a palindrome");
            else
                System.out.println(stack_word+" is not a palindrome");
        }
    }
    
}
