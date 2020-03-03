/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT01;

import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class DPlan extends ISP{

    public DPlan(String name, int mbps, int gb) {
        super(name, mbps, gb);
    }

    @Override
    public double Price() {
      return 10*mbps+0.2*gb;
    }
    
    @Override
    public String toString(){
        DecimalFormat pri = new DecimalFormat("#.##");
        return super.toString()+"\nPlan: DPLan with price RM: "+pri.format(Price());
    }
}
