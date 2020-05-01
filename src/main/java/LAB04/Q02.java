/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = a.next();
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0;i<word.length();i++){
            list.addNode(word.charAt(i));
        }
        System.out.print("The original list: ");
        list.showlist();
        list.splitList();
    }
    
}
