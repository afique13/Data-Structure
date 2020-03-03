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
public abstract class ISP {
    
    private String name;
    protected int gb, mbps;
    
    public ISP(String name, int mbps, int gb){
        this.name=name;
        this.mbps=mbps;
        this.gb=gb;
    }
    
    public abstract double Price();
    
    public String toString(){
        return mbps+"Mbps Subscription and "+gb+"GB";
    }
}
