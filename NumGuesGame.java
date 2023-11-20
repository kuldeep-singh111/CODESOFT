// developed by kuldeep 
// Number Guessing Game!

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int attempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + min + " and " + max + ". You have " + attempts + " attempts.");

        while (true) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            int remainingAttempts = attempts;

            while (remainingAttempts > 0) {
                System.out.print("Attempts left: " + remainingAttempts + ". Enter your guess: ");
                int userGuess = input.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    score += attempts - remainingAttempts + 1;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try a higher number.");
                } else {
                    System.out.println("Too high. Try a lower number.");
                }
                remainingAttempts--;
            }

            if (remainingAttempts == 0) {
                System.out.println("Sorry, you've run out of attempts. The number was " + randomNumber + ".");
            }

            System.out.println("Your score is: " + score);

            System.out.print("Do you want to play again? (yes or no): ");
            String playAgain = input.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        input.close();
    }
}
