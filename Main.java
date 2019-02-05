
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args){
        
        System.out.println("Welcome to the Guessing game");
        System.out.println("Pick a number: ");
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxNum;
        int numOfGuesses = 0;
        int results = 0;
        int guess;
        boolean playAgain;
        
        do {
        maxNum = random.nextInt(50);
        guess = 0;
        playAgain = false;
        
        while(guess != maxNum) {
            System.out.println("Please enter a number 1 through 50");
            guess = scanner.nextInt();
            numOfGuesses++;
            
            if (guess < 1 || guess > 50) {
               System.out.println("Invaild Input"); 
        
            }else if(guess < maxNum) {
                System.out.println("Your guess is too low");
              
            } else if(guess > maxNum) {
                System.out.println("Your guess is too high");
            }
        }
        results++;
        System.out.println("Great Job you won! Your number of guesses was: " + numOfGuesses + " and the number was: " + maxNum);
        System.out.println("Would you like to play again?");
        
        switch(scanner.next()) {
            
           case "yes":
            playAgain = true;
                break;
           default:
                break;
            }
        } while(playAgain);
        System.out.println("Thank you Goodbye!");
}
}



        
        
       
        
      
        
        
        
        
        
        
    

