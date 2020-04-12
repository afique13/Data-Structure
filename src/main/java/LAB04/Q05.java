/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import java.util.Iterator;

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
          LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addNode("ARS");
        linkedList.addNode("CHE");
        linkedList.addNode("LEI");
        linkedList.addNode("MAN");
        linkedList.addNode("LIV");
        linkedList.addNode("TOT");
        System.out.print("The list contains of ");
        linkedList.showlist();
        System.out.println("Remove all the word that contains of the A character using iterator");

        linkedList.deleteSpecificNode("LEI");
        Iterator<String> iterator = linkedList.listIterator();
        
        
        while (iterator.hasNext()) {
            String it = iterator.next();
            if (it.contains("A")) {
                iterator.remove();
            }
        }
        System.out.print("The updated list contains ");
        linkedList.showlist();
    }
    
}
