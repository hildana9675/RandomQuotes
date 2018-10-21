/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomquotes;
import java.io.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Hildana
 */
public class RandomQuotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> quotes = new ArrayList<String>();
        
        BufferedReader readFile = new BufferedReader (
                new FileReader ("c:/Comp_11/quote.txt"));
       
        String line = "";
        
        while ((line = readFile.readLine()) != null) {
            quotes.add(line); 
        }
        
        int num = (int)(Math.random() * quotes.size());
        
        JOptionPane.showMessageDialog(null, "Random Quote:\n" + quotes.get(num));
        
    }
    
}
