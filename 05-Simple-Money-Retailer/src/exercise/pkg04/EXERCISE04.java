/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg04;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double qty, cost, discount = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your quantity to be purchase: ");
        qty = scan.nextDouble();
        
        cost = qty * 100;
        
        if (qty > 1000){
            discount = cost * 0.10;
            cost -= discount;
            System.out.println("The Final Cost with a discount of 10% is " + cost);
        }
        else if (qty <= 1000 && qty > 1)
            System.out.println("The Final Cost without a discount of 10% is " + cost);
        else
            System.out.println("Entered quantity is an error...please enter a positive integer only!");
    }
    
}
