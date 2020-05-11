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
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter a sentence: ");
        Scanner a = new Scanner(System.in);
        String sentence = a.nextLine();
        System.out.println("Original Sentence: "+sentence);
        Stack<Character> reverse_letter = new Stack<>();
        Stack<String> reverse_word = new Stack<>();
        
        String [] word = sentence.split(" ");
        
        for(int i=0;i<sentence.length();i++){
            reverse_letter.push(sentence.charAt(i));
        }
        
        for(int i=0;i<word.length;i++){
            reverse_word.push(word[i]);
        }
        
        System.out.print("The sentence in reverse order: ");
        reverse_letter.showStack();
        System.out.print("The words in reverse order: ");
        reverse_word.showStack();
    }
    
}
