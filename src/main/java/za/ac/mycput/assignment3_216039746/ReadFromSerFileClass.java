/*
 * To change this license header, choose License Headers readArrayList Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template readArrayList the editor.
 */
package za.ac.mycput.assignment3_216039746;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * ADP2 - Assignment 3
 * @author Lundi Mkhungwane - 216039746
 * Due on 09 June 2021
 */
public class ReadFromSerFileClass {
    private ObjectInputStream input;
    ArrayList<Object> readArrayList = new ArrayList<>();

    public void openSerFile() {
        try{
            input = new ObjectInputStream( new FileInputStream("stakeholder.ser"));
            System.out.println(">>> file open for reading <<<");
        }
        catch (IOException ioe) {
            System.out.println(">>> error opening file: \n" + ioe.getMessage());
        } 
    } // end openSerFile method
    
    public void closeSerFile(){
        try{
            input.close();
        }
        catch (IOException ioe){
             System.out.println(">>> error closing ser file: " + ioe.getMessage());
        }
    } // end closeSerFile method
    
    public ArrayList<Object> readObjects(){
 
    boolean cont = true;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
            while(cont){
                  Object obj=null;
                try {
                    obj = ois.readObject();
                    System.out.println(obj);
                } 
                catch (ClassNotFoundException ioe) {
                    System.out.println("error reading ser file: " + ioe);
                }
                if(obj != null)
                    readArrayList.add(obj);
                  else
                     cont = false;
            } // loop end
        } 
        catch (FileNotFoundException e) {
            System.out.println("");
        } catch (IOException e) {
           System.out.println("");
        }
        finally {
            closeSerFile();
            System.out.println(">>> ser file closed successfully <<<");
        } // end try, catch, finally blocks  

        return readArrayList;
 
    } // end readObjects() method
}