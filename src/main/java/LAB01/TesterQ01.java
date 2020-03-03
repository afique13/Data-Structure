/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB01;

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
        Time[] masa = new Time[3];
        int [] hour = {13, 33, 10};
        int [] minute = {45, 15, 52};
        
        for(int i=0;i<masa.length;i++){
            masa[i] = new Time(hour[i], minute[i]);
            System.out.println(masa[i].toString());
        }
    }
    
}
