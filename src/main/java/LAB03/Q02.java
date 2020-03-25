/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("Q2.txt"));
            p.println("my name is sir fux a lot");
            p.close();
            try{
                Scanner file = new Scanner(new FileInputStream("Q2.txt"));
                while(file.hasNextLine()){
                    String line = file.nextLine();
                    String newline = "";
                    reverse(line,line.length(),newline);
                }
                    file.close();
            }catch(FileNotFoundException e){
                System.out.println("File was not found");
            }
        }catch(IOException e){
            System.out.println("Sorry what");
        }
    }
    
    public static void reverse(String line, int length, String newline){
        try{
            PrintWriter write = new PrintWriter(new FileOutputStream("Q2reverse.txt"));
            newline = newline + line.charAt(length-1);
            if(length==1)
                write.print(newline);
            write.close();
        }catch(IOException e){
            System.out.println("Action could not be taken");
        }
        
            if(length!=1)
                reverse(line,length-1,newline);
    }
    
}
