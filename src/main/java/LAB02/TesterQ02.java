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
public class TesterQ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Text File Log Size 5");
        TextFile <String> a = new TextFile<>(5); 
        a.Insert("James");
        a.Insert("Ahmad");
        a.Insert("Siti");
        a.Insert("Ramesh");
        a.Insert("John");
        a.Display();
        System.out.println("");
        a.Insert("Pantat");
        a.itemCheck("Siti");
        a.Delete();
        System.out.println(a.Size());
    }
    
}
