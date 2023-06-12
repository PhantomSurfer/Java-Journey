/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam.pkg01;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXAM01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PROBLEM 08
        // ¥ Yen to ₱ Peso
        
        double money, new_money;
        Scanner mon = new Scanner (System.in);
        System.out.print("Enter the amount of ¥ Japanese Yen you want to convert into ₱ PHP Peso: ");
        money = mon.nextDouble();
        
        new_money = money * 0.42114;
        
        System.out.println("The amount of ₱ PHP Peso is converted from ¥ Japanese Yen is: ₱ " + String.format("%.2f", new_money));
        
        System.out.println("");
    }
    
}
