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
public class Time {
    
    private int hr, min;
    
    public Time(int hr, int min){
        this.hr=hr;
        this.min=min;
    }
    
    public boolean Check(){
        if(hr>=23||min>=59)
            return false;
        else
            return true;
    }
    
    @Override
    public String toString(){
        if(hr==0&&Check()==true){
            return "Hour: 0 Minute: "+min+" 12:"+min+" AM";
        }else if(hr>12&&Check()==true)
            return "Hour: "+hr+" Minute: "+min+" "+(hr-12)+":"+min+" PM";
        else if(hr<12&&Check()==true)
            return "Hour: "+hr+" Minute: "+min+" "+hr+":"+min+" AM";
        else
            return "Hour: "+hr+" Minute: "+min+" Invalid time input";
    }
}
