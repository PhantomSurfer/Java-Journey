/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg02;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double q1, q2, q3, mje, grade, ave;
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THIS EXERCISE!!!");
        System.out.print("Please Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Please Enter Your Score for Quiz 1: ");
        q1 = input.nextDouble();
        System.out.print("Please Enter Your Score for Quiz 2: ");
        q2 = input.nextDouble();
        System.out.print("Please Enter Your Score for Quiz 3: ");
        q3 = input.nextDouble();
        System.out.print("Please Enter Your Score for Major Exam: ");
        mje = input.nextInt();
        
        ave = (q1 + q2 + q3)/3;
        grade = (ave * 0.40) + (mje * 0.60);
        
        System.out.println("Hello " + name + ", your Final Grade is " + String.format("%.2f", grade));
    }
    
}
