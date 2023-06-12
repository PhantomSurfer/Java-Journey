/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem11;

/**
 *
 * @author Jason
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("C:/Users/Jason/Desktop/2nd Term/Java - Problem/file.txt"); // Replace with your file path
            Scanner scan = new Scanner(file);
            int wordCount = 0;
            int totalLength = 0;
            while (scan.hasNext()) {
                String word = scan.next();
                wordCount++;
                totalLength += word.length();
            }
            scan.close();
            double averageLength = (double) totalLength / wordCount;
            System.out.println("The average length of words in the file is: " + averageLength);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
}
