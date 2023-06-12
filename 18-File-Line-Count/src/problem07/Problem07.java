/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem07;

/**
 *
 * @author Jason
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File file = new File("C:/Users/Jason/Desktop/2nd Term/Java - Problem/file.txt");
            Scanner scan = new Scanner(file);
            int lineCount = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                lineCount++;
            }
            scan.close();
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
}
