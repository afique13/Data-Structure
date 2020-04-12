/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class StarList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Player 2 starts first");
        LinkedList<Character> player1 = new LinkedList<>();
        LinkedList<Character> player2 = new LinkedList<>();
        Random a = new Random();
        boolean check = false;
        
        while(check==false){
            int p1 =a.nextInt(6)+1;
            int p2 = a.nextInt(6)+1;
            for(int i=0;i<p1;i++){
                    player1.addNode('*');
                }
                for(int i=0;i<p2;i++){
                    player2.addNode('*');
                }
                System.out.print("Player 2: ");
                player2.showlist();
                System.out.print("Player 1: ");
                player1.showlist();
                
            if(player1.Length()>20||player2.Length()>20){
                check=true;
                if(player1.Length()>player2.Length())
                    System.out.println("PLAYER 1 WINS THE GAME");
                else
                    System.out.println("PLAYER 2 WINS THE GAME");
            }
        }
        
        
    }
    
}
