/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg05;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double year, salary, bonus, net_bonus;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = scan.nextDouble();
        System.out.print("Enter your years of service: ");
        year = scan.nextDouble();
        
        if (year > 5){
            bonus = salary * 0.05;
            net_bonus = salary + bonus;
            System.out.println("Your Net Bonus Amount with Your Salary is " + net_bonus);
        }
        else if (year <= 5 && year > 1){
            System.out.println("Sorry but there is no bonus as you need more than 5 years of service to earn an incentive!");
            System.out.println("Your salary without a bonus is " + salary);
        }
        else
            System.out.println("There is an error occured due to your inputs...please try again!!!");
    }
    
}
