/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB04;

import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] code = {"WXX101","WXX201","WXX301"};
        String [] name = {"Programming","Networking","Operating System"};
        int [] hours = {5,4,3};
        char [] grade = {'B','C','A'};
        
        LinkedList<String> coursecode = new LinkedList<>();
        LinkedList<String> coursename = new LinkedList<>();
        LinkedList<Integer> credithours = new LinkedList<>();
        LinkedList<Character> grades = new LinkedList<>();
        
        for(int i=0;i<code.length;i++){
            coursecode.addNode(code[i]);
            coursename.addNode(name[i]);
            credithours.addNode(hours[i]);
            grades.addNode(grade[i]);
        }
        
        int points=0;
        for(int i=0;i<code.length;i++){
            System.out.println("Course : "+coursecode.get(i)+" ("+coursename.get(i)+") - "+credithours.get(i)+" credit hours. Grade : "+grades.get(i)+" -->");
            switch(grades.get(i)){
                case 'A':
                    points+=credithours.get(i)*4;
                    break;
                case 'B':
                    points+=credithours.get(i)*3;
                    break;
                case 'C':
                    points+=credithours.get(i)*2;
                    break;
                case 'D':
                    points+=credithours.get(i)*1;
                    break;
                default:
                    points+=credithours.get(i)*0;
            }
        }
        
        System.out.println("Total point is "+points);
        System.out.println("Total credit is "+credithours.sum());
        double gpa = (double)points/(double)credithours.sum();
        DecimalFormat revised_gpa = new DecimalFormat("#.##");
        System.out.println("Grade point average is "+revised_gpa.format(gpa));
    }
    
}
