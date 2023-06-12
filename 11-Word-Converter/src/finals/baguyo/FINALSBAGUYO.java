/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finals.baguyo;

/**
 *
 * @author Jason
 */
import java.util.Scanner;    // Import the Scanner class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class FINALSBAGUYO {

    /**
     * @param args the command line arguments
     */
    public static int stringLength(String oriString){ //This will check the length of the string
        int length = oriString.length(); //Using length() method to return the length of the string
        return length;
    }
    
    public static String upperCase(String oriString){ //This will modify the string to uppercase format
        String upper = oriString.toUpperCase(); //Using toUpperCase() method to convert the string to its uppercase version
        return upper;
    }
    
    public static String lowerCase(String oriString){ //This will modify the string to lowercase format
        String lower = oriString.toLowerCase(); //Using toLowerCase() method to convert the string to its lowercase version
        return lower;
    }
    
    public static char FcharString(String oriString){ //This will take the first character of the string
        char firstChar = oriString.charAt(0); //Using charAt() method and using 0 as its index it will take the first character
        return firstChar;
    }
    
    public static char LcharString(String oriString){ //This will take the last character of the string
        int length = oriString.length();              //First is to determine the length for the last character  
        char lastChar = oriString.charAt(length - 1); //Similar in getting the first character, using the length to get the last character
        return lastChar;                              //we minus 1 to the length as the length would be landing on an empty node, if we minus 1
    }                                                 //we will land to the true last character
    
    public static void main(String[] args) {
        // TODO code application logic here
        FINALSBAGUYO stringDetails = new FINALSBAGUYO();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String oriString = scan.nextLine();
        
        int lengthString = stringLength(oriString);
        String UPPER = upperCase(oriString);
        String LOWER = lowerCase(oriString);
        char fchar = FcharString(oriString);
        char lchar = LcharString(oriString);
        
        try {
            FileWriter myWriter = new FileWriter("FINAL-OUTPUT.txt"); //\n is for next line for the text file
            myWriter.write("RESULT OF FINAL OUTPUT\n\n");
            
            myWriter.write("Original String:\n");
            myWriter.write(oriString + "\n\n");
            
            myWriter.write("Length of String:\n");
            myWriter.write(lengthString + " character\n\n");
            
            myWriter.write("Uppercase of String:\n");
            myWriter.write(UPPER + "\n\n");
            
            myWriter.write("Lowercase of String:\n");
            myWriter.write(LOWER + "\n\n");
            
            myWriter.write("First Character of String:\n");
            myWriter.write(fchar + "\n\n");
            
            myWriter.write("Last Character of String:\n");
            myWriter.write(lchar + "\n\n");
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
}
