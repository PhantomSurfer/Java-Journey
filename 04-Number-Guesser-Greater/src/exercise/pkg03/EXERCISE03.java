/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg03;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter your second number: ");
        num2 = scan.nextInt();
        scan.close();
        
        if (num1 == num2)
            System.out.println("Both numbers are equal!");
        else if (num1 > num2)
            System.out.println(num1 + " is greater!");
        else
            System.out.println(num2 + " is greater!");
    }
    
}
