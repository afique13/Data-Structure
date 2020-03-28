/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT04;

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
        int [] even = {23,15,17,28,12,40};
        LinkedList<Integer> num = new LinkedList<>();
        for(int i=0;i<even.length;i++){
            num.addNode(even[i]);
        }
        num.showlist();
        System.out.println("Linked List has "+num.Length()+" node(s)");
        System.out.println("Total is "+num.sum());
        System.out.println("Total even number is "+num.EvenNumber(even.length));
    }
    
}
