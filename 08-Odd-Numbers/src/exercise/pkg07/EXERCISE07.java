/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg07;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class EXERCISE07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = 5, i, sum = 0, alt = 1, pos = 0, odd = 0;
        double ave;
        int arr[] = new int[n];
        int post[] = new int[n], odded[] = new int[n];
        
        for (i = 0; i < n; i++){
            System.out.print(alt + "| Enter your Number: ");
            arr[i] = scan.nextInt();
            alt++;
            
            if (arr[i] > 0){
                pos++; //This will count how many positive number is
                post[i] = arr[i]; //current arr[i] will be put inside the post[i] for later output same for odd
            }
            
            if ((arr[i] % 2) != 0){
                odd++; //This will count how many odd number is
                odded[i] = arr[i];
            }
        }
        
        System.out.println();
        
        for (i = 0; i < n; i++)
            sum = sum + arr[i];

        ave = sum / n;
        
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
        System.out.println("The Sum: " + sum);
        System.out.println();
        
        System.out.println("The Average: " + String.format("%.2f",ave));
        System.out.println();
        
        System.out.println("The amount of Positive Numbers are " + pos);
        System.out.print("Positive Number Array: [ ");
        for (int x : post)
            System.out.print(x + " ");
        System.out.print("]");
        
        System.out.println();
        System.out.println();
        
        System.out.println("The amount of Odd Numbers are " + pos);
        System.out.print("Odd Number Array: [ ");
        for (int y : odded)
            System.out.print(y + " ");
        System.out.print("]");
        
        System.out.println();
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
    }
    
}
