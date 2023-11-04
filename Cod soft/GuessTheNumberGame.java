//Number Game

import java.util.Scanner;
import java.util.Random;


public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 5;
        
        int roundsWon = 0;
        System.out.println("Toptal 5 attempt");

        System.out.println("Welcome to the Guess the Number game!");

        while (true) {
            int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int attempts = 0;
            
            System.out.println("I'm thinking of a number between " + lowerLimit + " and " + upperLimit + ". Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < lowerLimit || userGuess > upperLimit) {
                    System.out.println("Please enter a number between " + lowerLimit + " and " + upperLimit + ".");
                    continue;
                }

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + (attempts + 1) + " attempts!");
                    roundsWon++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The secret number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! You won " + roundsWon + " round(s).");
                break;
            }
        }

        scanner.close();
    }
}
