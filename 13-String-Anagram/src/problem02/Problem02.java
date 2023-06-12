/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem02;

/**
 *
 * @author Jason
 */
import java.util.Arrays;
import java.util.Scanner;
public class Problem02 {

    /**
     * @param args the command line arguments
     */
    public static boolean areAnagrams(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        char[] firstStringChars = firstString.toLowerCase().toCharArray();
        char[] secondStringChars = secondString.toLowerCase().toCharArray();
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);
        return Arrays.equals(firstStringChars, secondStringChars);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String fString = scan.nextLine();
        System.out.print("Enter the second string: ");
        String sString = scan.nextLine();
        if (areAnagrams(fString, sString)) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams of each other.");
        }
    }
    
}
