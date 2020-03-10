/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT02;

/**
 *
 * @author Owner
 */
public class TesterQ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayDice a = new ArrayDice(5);
        System.out.print(a.toString()); 
        ArrayDice b = new ArrayDice(4);
        System.out.print(b.toString());

        LinkedListDice <Integer> c = new LinkedListDice<>(3);
        System.out.print(c.toString());
        LinkedListDice <Integer> d = new LinkedListDice<>(4);
        System.out.print(d.toString());

    }
    
}
