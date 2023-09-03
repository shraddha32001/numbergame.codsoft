package com.CODSOFT;



	import java.util.Random;
	import java.util.Scanner;

	public class NumberGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int maxAttempts = 10;
	        int userScore = 0;

	        System.out.println("Welcome to the Number Game!");
	        System.out.println("selected a number between " + minRange + " and " + maxRange + ".");
	        System.out.println("You have " + maxAttempts + " attempts to guess it.");

	        boolean playAgain = true;

	        while (playAgain) {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean hasGuessedCorrectly = false;

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    userScore++;
	                    hasGuessedCorrectly = true;
	                    break;
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (!hasGuessedCorrectly) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = scanner.next().toLowerCase();
	            playAgain = playAgainResponse.equals("yes");
	        }

	        System.out.println("Thanks for playing! Your total score is: " + userScore);
	        scanner.close();
	    }
	}
