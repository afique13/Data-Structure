/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT01;

/**
 *
 * @author Owner
 */
public class TesterQ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DPlan plan1 = new DPlan("DPlan", 5, 50);
        System.out.println(plan1.toString());
        MPlan plan2 = new MPlan("MPLan", 5, 50);
        System.out.println(plan2.toString());
        
        if(plan1.Price()>plan2.Price())
            System.out.println("MPlan is cheaper than DPlan");
        else
            System.out.println("DPlan is cheaper than MPlan");
        
    }
    
}
