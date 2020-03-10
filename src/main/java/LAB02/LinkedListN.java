/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class LinkedListN {
     private LinkedList<Integer> num;
    private int size;
    
    public LinkedListN(int size){
        this.size=size;
        num= new LinkedList<>();
    }
    
    public String toString(){
        Random r = new Random();
        int count=1;
        boolean check=true;
        String str="";
        num.add(r.nextInt(101));
        System.out.println("Linked List Implementation");
        for(int i=1;i<size;i+=0){
            int temp=r.nextInt(101);
            check=true;
            for(int j=0;j<count;j++){
                if(temp==num.get(j))
                    check=false;
            }
            if(check==true){
                num.add(temp);
                i++;
                str+=temp+" ";
                count++;
            }
        }
        Collections.sort(num);
        
        return str;
    }
}
