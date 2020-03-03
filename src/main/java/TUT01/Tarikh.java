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
public class Tarikh {
    
    private int day, month, year;
    
    public Tarikh(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    @Override
    public String toString(){
        String str;
        if(day>=10){
            str= day+"/";
        }else
            str="0"+day+"/";
        
        return "Day: "+day+" Month: "+month+" Year: "+year+"\nDate is : "+str+month+"/"+year;
    }
    
    
}
