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
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Character> letter = new Queue<>();
        String [] word = new String[5];
        word[0]="Was it a car or a cat I saw?";
        word[1]="?civic#";
        word[2]="race car";
        word[3]="redrawer";
        word[4]="put     it up";
        Stack<Character> palindrome = new Stack<>();
        for(int i=0;i<word.length;i++){
            String reverse="";
            String normal="";
            for(int j=0;j<word[i].length();j++){
                if(Character.isLetter(word[i].charAt(j)))
                    letter.enqueue(word[i].charAt(j));
            }
            int count=letter.getSize();
            for(int j=0;j<count;j++){
                normal+=letter.peek();
                palindrome.push(letter.dequeue());
            }
            for(int j=0;j<count;j++){
                reverse+=palindrome.pop();
            }
            if(reverse.equals(normal))
                System.out.println(word[i]+" is a palindrome");
            else
                System.out.println(word[i]+" is not a palindrome");
        }
    }
    }
    

