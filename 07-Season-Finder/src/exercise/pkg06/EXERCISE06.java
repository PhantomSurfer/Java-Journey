/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg06;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Switch and If Statement 
        int month = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a month number (1 to 12): ");
        month = scan.nextInt();
        
        System.out.println("");
        System.out.println("This the Switch Version!");
        System.out.println("");
        
        switch(month){
            case 1: case 2: case 12:
                System.out.println("The month number you have entered has a season of W I N T E R!");
                break;
            case 3: case 4: case 5:
                System.out.println("The month number you have entered has a season of S P R I N G!");
                break;
            case 6: case 7: case 8:
                System.out.println("The month number you have entered has a season of S U M M E R!");
                break;
            case 9: case 10: case 11:
                System.out.println("The month number you have entered has a season of A U T U M N!");
                break;
            default:
                System.out.println("The month number you have entered is out of bounds of the given limit ( 1 to 12 )... Please Try Again!");

        }
        
        System.out.println("");
        System.out.println("This the If Else Version!");
        System.out.println("");
        
        if (month == 1 || month == 2 || month == 12)
            System.out.println("The month number you have entered has a season of W I N T E R!");
        else if (month >= 3 && month <= 5)
            System.out.println("The month number you have entered has a season of S P R I N G!");
        else if (month >= 6 && month <= 8)
            System.out.println("The month number you have entered has a season of S U M M E R!");
        else if (month >= 9 && month <= 11)
            System.out.println("The month number you have entered has a season of A U T U M N!");
        else
            System.out.println("The month number you have entered is out of bounds of the given limit ( 1 to 12 )... Please Try Again!");
        
        System.out.println("");
        
    }
    
}
