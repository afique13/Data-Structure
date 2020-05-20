/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB06;

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
        Queue<String> player1 = new Queue<>();
        Queue<String> player2 = new Queue<>();
        player1.enqueue("6 Blue");
        player1.enqueue("2 Green");
        player1.enqueue("9 Yellow");
        player1.enqueue("1 Green");
        player1.enqueue("4 Red");
        player2.enqueue("7 Blue");
        player2.enqueue("9 Blue");
        player2.enqueue("9 Red");
        player2.enqueue("4 Blue");
        player2.enqueue("2 Yellow");
        int max = player1.getSize();
        int count1 = 0, count2=0;
        System.out.println("Player 1 Card");
        player1.showQueueHorizontal();
        System.out.println("Player 2 Card");
        player2.showQueueHorizontal();
        for(int i=0;i<max;i++){
            String [] flag1 = player1.dequeue().split(" ");
            String [] flag2 = player2.dequeue().split(" ");
            int score1 = Integer.parseInt(flag1[0]);
            int score2 = Integer.parseInt(flag2[0]);
            if(score1>score2)
                count1+=1;
            else if(score2>score1)
                count2+=1;
            else{
                if(compareColour(flag1[1],flag2[1])==1)
                    count1+=1;
                else if(compareColour(flag1[1],flag2[1])==2)
                    count2+=1;
            } 
        }
        System.out.println("Player 1 Score: "+count1);
        System.out.println("Player 2 Score: "+count2);
        if(count1>count2)
            System.out.println("Player 1 WINS!");
        else if(count2>count1)
            System.out.println("Player 2 WINS!");
        else
            System.out.println("DRAW!");
    }
    
    public static int compareColour(String colour1, String colour2){
        String [] colours = new String[2];
        int [] score = new int[2];
        colours[0] = colour1;
        colours[1] = colour2;
        for(int i=0;i<colours.length;i++){
            switch(colours[i]){
                case "Blue":
                    score[i]=4;
                    break;
                case "Green":
                    score[i]=3;
                    break;
                case "Red":
                    score[i]=2;
                    break;
                case "Yellow":
                    score[i]=1;
                    break;
            }
        }
        if(score[0]>score[1])
            return 1;
        else if(score[1]>score[0])
            return 2;
        else
            return 0;
    }
    
}
