/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexam;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class MIDTERMEXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n, i, alt = 1, pos = 0, neg = 0, zer = 0;
        
        System.out.print("Enter the number of integers to input: ");
        n = scan.nextInt();
        /*
        if (n > 0){
            int arr[] = new int[n];
            
            for (i = 0; i < n; i++){
            System.out.print("Enter integer " + alt + " : ");
            arr[i] = scan.nextInt();
            alt++;
            
            if (arr[i] > 0)
                pos++; //This will count how many positive number is
            else if (arr[i] < 0)
                neg++; //This will count how many negative number is
            else
                zer++; //This will count how many zero number is
            }
        
            System.out.println();
            System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            System.out.println();

            System.out.println("The Number of Positive Integer/s is: " + pos);
            System.out.println();

            System.out.println("The Number of Negative Integer/s is: " + neg);
            System.out.println();

            System.out.println("The Number of Zero Integer/s is: " + zer);
            System.out.println();

            System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
        }
        else
            System.out.println("Error Occured... You have inputed a negative integer on the amount of inputs... Please Try Again...");
        */
        if (n > 0){
            do{
                System.out.print("Enter integer " + alt + " : ");
                i = scan.nextInt();
                if (i > 0)
                    pos++; //This will count how many positive number is
                else if (i < 0)
                    neg++; //This will count how many negative number is
                else
                    zer++; //This will count how many zero number is
                n--;
                alt++;
            }while (n != 0);
            System.out.println();
            System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
            System.out.println();

            System.out.println("The Number of Positive Integer/s is: " + pos);
            System.out.println();

            System.out.println("The Number of Negative Integer/s is: " + neg);
            System.out.println();

            System.out.println("The Number of Zero Integer/s is: " + zer);
            System.out.println();

            System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
        }
        else
            System.out.println("Error Occured... You have inputed a negative integer on the amount of inputs... Please Try Again...");
    }
    
}
