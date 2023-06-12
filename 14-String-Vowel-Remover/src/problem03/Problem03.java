/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem03;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class Problem03 {

    /**
     * @param args the command line arguments
     */
     public static String removeVowels(String inputString) {
        return inputString.replaceAll("[aeiouAEIOU]", "");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String oriString = scan.nextLine();
        String removedVowels = removeVowels(oriString);
        System.out.println("String after removing vowels: " + removedVowels);
    }
}
