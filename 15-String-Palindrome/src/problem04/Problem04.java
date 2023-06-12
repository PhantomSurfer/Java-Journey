/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem04;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class Problem04 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String oriString) {
        oriString = oriString.toLowerCase().replaceAll("\\s+", "");
        int length = oriString.length();
        for (int i = 0; i < length/2; i++) {
            if (oriString.charAt(i) != oriString.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String oriString = scan.nextLine();
        if (isPalindrome(oriString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
