/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner read1 = new Scanner(new FileInputStream("lab5q05.txt"));
            int count=0;
            
            try{
               BufferedReader read2 = new BufferedReader(new FileReader("lab5q05.txt"));
                while (read2.readLine() != null) count++;
            read2.close();
            }catch(IOException e){
                System.out.println("File could not be retrieved");
            }
            
            String [] line = new String[count];
            int i=0;
            while(read1.hasNextLine()){
                line[i] = read1.nextLine();
                System.out.println(line[i]);
                i++;
            }
            Stack<String> start = new Stack<>();
            Stack<String> end = new Stack<>();
            for(int j=0;j<line.length;j++){
                String [] word = line[j].split(" ");
                if(word.length==1){
                    if(word[0].contains("<")&&!word[0].contains("/")){
                        String temp1 = line[j].substring(line[j].indexOf("<")+1, line[j].indexOf(">"));
                        start.push(temp1);
                        if(XMLCheck(start,end).equals("break"))
                            break;
                    }else if(word[0].contains("/")){
                        int index = word[0].indexOf("</");
                        int instance = word[0].length() - word[0].replaceAll("</","").length();
                        String temp2_1 = "";
                        boolean flag=false;
                        if(index!=0){
                            temp2_1 = line[j].substring(line[j].indexOf("<")+1, line[j].indexOf(">"));
                            start.push(temp2_1);
                            flag=true;
                        }
                        String temp2 = line[j].substring(index+2,word[0].length()-1);
                        if(flag==true)
                            end.push(temp2);
                        else if(instance>1){
                            System.out.println("Invalid beginning element: </"+temp2+">");
                            break;
                        }else
                            start.push(temp2);
                        
                        if(XMLCheck(start,end).equals("break"))
                            break;
                    }
                }else{
                    for(int k=0;k<word.length;k++){
                        
                    }
                }
             }
            read1.close();
        }catch(FileNotFoundException e){
            System.out.println("Sorry, file could not be retrieved");
        }
    }
    
    public static String XMLCheck(Stack<String> start,Stack<String> end){
        if(start.peek().equals(end.peek())){
            start.pop();
            end.pop();
            if(start.isEmpty()){
            System.out.println("XML document is valid");
            return "break";}
            return "";
        }else if(!start.peek().equals(end.peek())&&end.getSize()>0){
            System.out.println("<"+start.pop()+"> Invalid ending element : "+"</"+end.pop()+">");
            return "break";
        }else
            return "";
        
    }
    
}
