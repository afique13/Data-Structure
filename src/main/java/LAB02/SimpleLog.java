/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB02;

/**
 *
 * @author Owner
 */
public interface SimpleLog<T> {
    
    public void Insert(T item);
    
    public boolean Check(int count);
    
    public int Size();
    
    public <K extends Comparable<K>> boolean itemCheck(T input);
    
    public void Delete();
    
    public void Display();
    
}
