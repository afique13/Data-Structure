/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB02;

import java.util.LinkedList;

/**
 *
 * @author Owner
 */
public class TextFile<T> implements SimpleLog<T> {
    
    private LinkedList<T> item;
    private int size, count;
    
    public TextFile(int size){
        this.size=size;
        item = new LinkedList<>();
    }

    public void Insert(T input) {
        count++;
       if(!Check(count)){
           item.add(input);
       }else
            System.out.println("Adding another record\nThe log is full");
    }

    public boolean Check(int count) {
        if(count>size)
            return true;
        else
            return false;
    }

    public int Size() {
       return item.size();
    }

    public <K extends Comparable<K>> boolean itemCheck(T input) {
        System.out.println("Searching for "+input+" in the file");
       for(int i=0;i<Size();i++){
           T temp = item.get(i);
           if(temp.equals(input)){
               System.out.println("Text File Log contains "+input);
               return true;
           }
       }
       
       return false;
    }

    public void Delete() {
        for(int i=0;i<size;i++){
            item.remove();
        }
        System.out.println("Clear the text file log");
        count=0;
        System.out.println("Text File Log Size "+count);
    }

    public void Display() {
        for(int i=0;i<item.size();i++){
            System.out.println(item.get(i));
        }
    }

}
