/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT01;

/**
 *
 * @author Owner
 */
public class Sentence {
    
    private String str;
    
    public Sentence(String str){
        this.str=str;
    }
    
    public int VowelCount(String vowel){
        int count=0;
        for(int i=0;i<vowel.length();i++){
            if(vowel.charAt(i)=='a'||vowel.charAt(i)=='e'||vowel.charAt(i)=='i'||vowel.charAt(i)=='o'||vowel.charAt(i)=='u')
                count++;
        }
        return count;
    }
    
    public int WordCount(){
        String [] split =str.split(" ");
        return split.length;
    }
    
    public int getLength(){
        return str.length();
    }
    
    @Override
    public String toString(){
        return "The sentence is: "+str+"\nThe length of the sentence : "+getLength()+"\nThe number of vowels : "+VowelCount(str)+"\nThe number of words : "+WordCount();
    }
    
    
    
}


