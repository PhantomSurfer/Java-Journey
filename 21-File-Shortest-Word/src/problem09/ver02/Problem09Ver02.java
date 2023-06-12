/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem09.ver02;

/**
 *
 * @author Jason
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem09Ver02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("C:/Users/Jason/Desktop/2nd Term/Java - Problem/file.txt");
            Scanner scan = new Scanner(file);
            String shortestWord = null;
            while (scan.hasNext()) {
                String word = scan.next();
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
            scan.close();
            System.out.println("The shortest word in the file is: " + shortestWord);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
}
