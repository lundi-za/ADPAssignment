
package za.ac.mycput.assignment3_216039746;

/**
 * ADP2 - Assignment 3
 * @author Lundi Mkhungwane - 216039746
 * Due on 09 June 2021
 */
public class RunReadClasses {
    public static void main(String[] args){
        
        ReadFromSerFileClass readOne = new ReadFromSerFileClass();
        readOne.openSerFile();
        readOne.readObjects();
        readOne.closeSerFile();
    }
}
