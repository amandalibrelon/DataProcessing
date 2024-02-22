/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataprocessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author amand
 */
public class DataProcessing {

    /* 
    given a file
    read all the data   
    validate it 
    output data
    */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String filename = "file.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        
        String line;
        while ( (line=br.readLine()) != null ) {
            //validation
            
            
        }
       //output
    }
    
}
