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
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter transaction : ");
        Queue<String> transaction = new Queue<>();
        String [] trans = new String[6];
        trans[0] = "D 400";
        trans[1] = "W 300";
        trans[2] = "W 700";
        trans[3] = "D 200";
        trans[4] = "D 450";
        trans[5] = "W 120";
        for(int i=0;i<trans.length;i++){
            System.out.print(trans[i]+" | ");
            transaction.enqueue(trans[i]);
        }
        System.out.println("");
        transaction.showQueueHorizontal();
        int balance = 500;
        System.out.println("Initial Balance : 500");
        int count = transaction.getSize();
        for(int i=0;i<count;i++){
            String amount="";
            for(int j=2;j<transaction.peek().length();j++){
                amount += transaction.peek().charAt(j);
            }
            int diff = Integer.parseInt(amount);
            if(transaction.peek().charAt(0)=='D'){
               balance+=diff;
                System.out.println("Deposit                     New Balance "+balance);
            }else{
                balance-=diff;
                if(balance<0){
                   balance+=diff;
                   System.out.println("Withdraw Rejected        New Balance "+balance);
               }else{
                   System.out.println("Withdraw                 New Balance "+balance);
                }
            }
            transaction.dequeue();
        }
    }
    
}
