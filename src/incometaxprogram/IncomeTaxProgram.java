/*
 * Anton dela Cruz
 * IncomeTaxProgram.java
 * This program will calculate the amount of income tax that is owed, determined by the salary entered.
 * October 1, 2018
 */
package incometaxprogram;
import java.util.Scanner;

/**
 *
 * @author antde
 */
public class IncomeTaxProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        double salary,decimal = 0,incometax;
        System.out.println("What is your salary?");
        salary = keyedInput.nextInt();
        
        if (salary <= 46605) {
            decimal = 0.15;
        }
        
        if (salary > 46605) {
            if (salary <= 93208) {
                decimal = 0.205;
            }
        }
       
        if (salary <= 144489) {
                decimal = 0.26;
            }
        
        if (salary <= 205842) {
            decimal = 0.29;
        }
        
        if (salary >= 205842) {
            decimal = 0.33;
        }
        incometax = salary * decimal; 
        
        System.out.println("Your income tax is " + incometax);
    }
    
}
