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
public class TesterQ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Q1<Integer,Integer> c1 = new Q1<>();
        c1.q1(2, 4);
        Q1<String,String> c2 = new Q1<>();
        c2.q1("loss","lose");
        Q1<String,String> c3 = new Q1<>();
        c3.q1("loss","loss");
        Q1<Integer,Integer> c4 = new Q1<>();
        c4.q1(16.7,13.3);
    }
    
}
