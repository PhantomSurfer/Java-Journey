/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam.pkg02;

/**
 *
 * @author Jason
 */
public class EXAM02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PROBLEM 09
        /**
         * Write a program which prints the numbers 1 to 200, 10 numbers per line. The 
         * program shall print " Whippna " in place of the numbers which are multiples of 2, "
         * choba " for multiples of 4, " dog " for multiples of 6. Print the number if it is not 
         * divisible by 2, 4 and 6. 
        */
        int n = 1, i, y = 200;
        int x[] = new int[y];
      
        for (i = 0; i < y; i++){
            System.out.print(" ");
            
            x[i] = n;
            
            if (x[i] % 6 == 0)
                System.out.print("dog");
            else if (x[i] % 4 == 0)
                System.out.print("choba");
            else if (x[i] % 2 == 0)
                System.out.print("Whippna");
            else
                System.out.print(x[i]);
            
            System.out.print("          ");
            
            if (x[i] % 10 == 0)
                System.out.println();
            
            n++;
        }
    }
    
}
