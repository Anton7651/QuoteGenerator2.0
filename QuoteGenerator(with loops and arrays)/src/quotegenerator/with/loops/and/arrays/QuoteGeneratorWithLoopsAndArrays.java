/*
 * Anton dela Cruz
 * November 1, 2018
 * This program will generate inspiring quotes every time the user presses
 */

package quotegenerator.with.loops.and.arrays;

import java.util.Scanner;

/**
 *
 * @author antde
 */

public class QuoteGeneratorWithLoopsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice;
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("--------------------Quote Generator--------------------");
        System.out.println("Enter in a number between 1 to 8 to generate a very inspiring quote");
        
        choice = keyedInput.nextInt();
        
        String [ ] quotes = new String [8];
        
        int num1 = 8;
        num1 = num1 - choice;
        
        if (choice > 8) {
            System.out.println("Please enter in a number between 1 and 8");
        }
        
        if (choice < 1) {
            System.out.println("Please enter in a number between 1 and 8");
        }
       
        quotes[0] = "With great power, comes great irresponsibility";
        quotes[1] = "Be nice to people, becasue I said so";
        quotes[2] = "No one has the right to judge you...except me";
        quotes[3] = "Nice hair, how did you make it come out your nose? LOL jk";
        quotes[4] = "You miss 100% of the shots you don't take (well...duh)";
        quotes[5] = "You have a nice face...I guess";
        quotes[6] = "What are you still doing here?";
        quotes[7] = "Better days are coming. they are called Saturday and Sunday";
        
        System.out.println("Quote:");
        System.out.println(quotes[num1]);
                
        
    }
    
}
