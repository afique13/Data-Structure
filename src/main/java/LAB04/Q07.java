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
public class Q07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularLinkedList<String> sentence = new CircularLinkedList<>();
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sen = a.nextLine();
        String [] word = sen.split(" ");
        for(int i=0;i<word.length;i++){
            sentence.addCircularNode(word[i]);
        }
        
        System.out.println("The words in the circular linked list");
        sentence.showCircularList();
        
    }
    
}
