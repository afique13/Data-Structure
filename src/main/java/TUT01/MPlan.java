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
public class MPlan extends ISP{

    public MPlan(String name, int mbps, int gb) {
        super(name, mbps, gb);
    }

    @Override
    public double Price() {
        return 5*mbps+0.8*gb;
    }
    
    @Override
    public String toString(){
         DecimalFormat pri = new DecimalFormat("#.##");
        return "Plan: MPLan with price RM: "+pri.format(Price());
    }
    
}
