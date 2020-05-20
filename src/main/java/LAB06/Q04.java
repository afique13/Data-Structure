/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        try {
            Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\Data-Structure-\\lab6Q4.txt"));
            Queue<Integer> shareQueue = new Queue<>();
            Queue<Integer> sharePriceQueue = new Queue<>();

            String[] values;
            int sellPrice = 0;
            int shareSell = 0;
            System.out.println("List of Transcations");
            while (scanner.hasNextLine()) {
                values = scanner.nextLine().split(" ");
                System.out.print("Day " + values[0] + " : ");
                if (values[1].contentEquals("B")) {
                    System.out.print("Buy ");
                    shareQueue.enqueue(Integer.valueOf(values[2]));
                    sharePriceQueue.enqueue(Integer.valueOf(values[3]));
                } else {
                    System.out.print("Sell ");
                    shareSell = Integer.valueOf(values[2]);
                    sellPrice = Integer.valueOf(values[3]);
                }
                System.out.print(values[2] + " shares at RM " + values[3]);
                System.out.println();
            }

            int gain = 0; // No pain, no gain
            int share, price;
            while (!shareQueue.isEmpty()) {
                share = shareQueue.dequeue();
                price = sharePriceQueue.dequeue();
                if (shareSell > share) {
                    shareSell -= share;
                    gain += (share * (sellPrice - price));
                } else {
                    gain += (shareSell * (sellPrice - price));
                }
            }
            System.out.println("Total Gain " + gain);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
