/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem05;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class Problem05 {

    /**
     * @param args the command line arguments
     */
    public static int countWords(String oriString) {
        String[] words = oriString.trim().split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String oriString = scanner.nextLine();
        int wordCount = countWords(oriString);
        System.out.println("Number of words in the string: " + wordCount);
    }
    
}
