/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem09;

/**
 *
 * @author Jason
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("C:/Users/Jason/Desktop/2nd Term/Java - Problem/file.txt");
            Scanner scan = new Scanner(file);
            String longestWord = "";
            while (scan.hasNext()) {
                String word = scan.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scan.close();
            System.out.println("The longest word in the file is: " + longestWord);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
}
