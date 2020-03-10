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
public class SpecialEncoding <T> {
    private T[] t;

    public SpecialEncoding(T[] t) {
        this.t = t;
    }
    
    public String toString(){
        String code = "The Code is ";
        String command = "\nThe Command is ";
        for (int i = 0; i < t.length; i++) {
            code += t[i].toString() + " ";
            if(t[i].toString().matches("[0C]")){
                command += "Copy ";
            }else if (t[i].toString().matches("[1D]")) {
                command += "Delete ";
            }else if (t[i].toString().matches("[2I]")) {
                command += "Insert ";
            }else if (t[i].toString().matches("[3P]")) {
                command += "Print ";
            }else if (t[i].toString().matches("[4R]")) {
                command += "Rename ";
            }else if (t[i].toString().matches("[5V]")) {
                command += "Paste ";
            
            }
                
        }
        return code + command;
    }

}
