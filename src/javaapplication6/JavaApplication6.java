/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxsmith
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       
        // TODO code application logic here
        URL url1 = new URL("http://bksworkwear.co.uk/allwords.txt");
         URL url2 = new URL("http://bksworkwear.co.uk/places.txt");
          BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));
      // BufferedReader in = new BufferedReader(new FileReader("/Users/maxsmith/desktop/allwords.txt"));
        String str;

        List<String> list = new ArrayList<>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        String[] words = list.toArray(new String[0]);
        
         BufferedReader in2 = new BufferedReader(new InputStreamReader(url2.openStream()));
        //BufferedReader in2 = new BufferedReader(new FileReader("/Users/maxsmith/desktop/places.txt"));
        String str2;
        
        List<String> list2 = new ArrayList<>();
        while((str2 = in2.readLine()) != null){
            list2.add(str2);
        }
        
        String[] places = list2.toArray(new String[0]);
        
        System.out.println(words.length);
        System.out.println(places.length);

      
       
        
        
        for(int i=1; i<words.length; i++){
            System.out.println(words[i-1]);
            for(int j=1; j<places.length; j++){
            System.out.println(places[j-1]+" "+words[i-1]);
            System.out.println(words[i-1]+" "+places[j-1]);
            System.out.println(words[i-1]+" in "+places[j-1]);
            }
            
            //for(int j=1; j<words.length; j++){
               //System.out.println(words[j-1]+" "+words[i]);
               //for(int k=1; k<places.length; k++){
               //System.out.println(words[j-1]+" "+words[i]+" "+places[k-1]);
               //System.out.println(words[j-1]+" "+words[i]+" in "+places[k-1]);
              // System.out.println(places[k-1]+" "+words[j-1]+" "+words[i]);
              // }
            //}
        }
        
    }
    
        
        
        
    }
    
