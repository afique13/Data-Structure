/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT03;

/**
 *
 * @author Owner
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        writeLine('$',3);
        writeBlock('$',3,2);
    }
    
    public static void writeLine(char symbol,int num){
        if(num==0)
            System.out.println("");
        else{
            System.out.print(symbol);
            writeLine(symbol,num-1);
        }
    }
    
    public static void writeBlock(char symbol, int m, int n){
        if(m==0||n==0)
            System.out.println("");
        else if(m==0)
            writeLine(symbol,m);
        else{
            writeLine(symbol,m);
            writeBlock(symbol,m,n-1);
        }
            
    }
    
}
