/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem01;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class Problem01 {

    /**
     * @param args the command line arguments
     */
    public static String reverseString(String oriString) {
        StringBuilder stringBuilder = new StringBuilder(oriString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String oriString = scan.nextLine();
        String revString = reverseString(oriString);
        System.out.println("Original String: " + oriString);
        System.out.println("Reverse String: " + revString);
    }
    
}
