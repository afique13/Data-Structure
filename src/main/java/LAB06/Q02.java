/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
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
        try {
            Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\Data-Structure-\\lab6Q2.txt"));
            // Use ArrayList
            ArrayList<String> products = new ArrayList<>();
            ArrayList<Queue<String>> queueArrayList = new ArrayList<>();

            String line;
            String[] elements;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                elements = line.split(" ");
                int index = 0;
                for (String element : elements) {
                    if (element.contains("P0")) {
                        if (!products.contains(element)) {
                            products.add(element);
                            Queue<String> queue = new Queue<>();
                            queueArrayList.add(queue);
                        }
                        index = products.indexOf(element);
                    } else {
                        Queue<String> queue = queueArrayList.get(index);
                        queue.enqueue(element);
                    }
                }
            }
            System.out.print("Product Code in Queue : ");
            for (int i  = 0; i < products.size(); i++) System.out.print(products.get(i) + " --> ");
            System.out.println();

            System.out.println("List of product by categories");
            for (int i = 0; i < products.size(); i++) {
                System.out.println("Product : " + products.get(i));
                queueArrayList.get(i).showQueueHorizontal();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
