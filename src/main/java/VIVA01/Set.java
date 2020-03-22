/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIVA01;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Set<T> {
    
    private ArrayList<Integer> elem1 = new ArrayList<>();
    private ArrayList<Integer> elem2 = new ArrayList<>();
    private ArrayList<Integer> newelem;
    private T maxsize;
    
    public Set(T maxsize,ArrayList<Integer> elem1,ArrayList<Integer> elem2){
        this.maxsize=maxsize;
        this.elem1=elem1;
        this.elem2=elem2;
    }
    
    public <K extends Comparable<K>> ArrayList<Integer> union(){
        for(int i=0;i<elem2.size();i++){
            for(int j=0;j<elem1.size();j++){
                if(elem1.get(j).compareTo(elem2.get(i))==0){
                    elem1.remove(elem1.get(j));
                }
            }
        }
        int newsize = elem2.size()+elem1.size();
        newelem = new ArrayList<>(newsize);
        int j=0;
        for(int i=0;i<newsize;i++){
            if(i<elem2.size()){
                newelem.add(elem2.get(i));
            }
            else{
                newelem.add(elem1.get(j));
                  j+=1;
            }
            
        }
        return newelem;
    }
    
    public int cardinality(ArrayList a){
       return a.size();
   }
    
    public boolean isSubset (ArrayList<T> list1){
        ArrayList<T> isSubset = new ArrayList<T>();
        int count = 0;
        for (int i = 0; i < list1.size(); i++){
            if (elem2.contains(list1.get(i))){
            count++; 
          }
        }
            if(count == list1.size() && elem2.size() != list1.size()){
                return true;
            } else {
                return false;
            } 
    }
    
 public ArrayList<Integer> toString(ArrayList<Integer> b)
    {
        int temp;
        for(int i = 0; i < b.size();i++)
        {
            temp = b.get(i);
            for(int j=0;j<b.size();j++){
                if(j==i)
                    continue;
                if(temp==b.get(j))
                    b.remove(b.get(j));
            }
        }
        
        return b;
    }
 
 public ArrayList<Integer> Intersect(){
     int newsize;
     if(elem1.size()>elem2.size())
         newsize = elem1.size();
     else
         newsize = elem2.size();
     
        newelem = new ArrayList<>(newsize);
     for(int i=0;i<elem2.size();i++){
            for(int j=0;j<elem1.size();j++){
                if(elem1.get(j).compareTo(elem2.get(i))==0){
                    newelem.add(elem1.get(j));
                }
            }
        }
     
     return newelem;
 }
    
}
