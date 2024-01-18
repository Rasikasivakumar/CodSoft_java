import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalScore = 0;

        System.out.println("Welcome to the Guess the Number Game!");

        do {
            int targetNumber = getRandomNumber(minRange, maxRange);
            int userGuess;
            int attempts = 0;

            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Guess the number between " + minRange + " and " + maxRange);

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

            } while (userGuess != targetNumber && attempts < maxAttempts);

            System.out.println("The correct number was: " + targetNumber);
            System.out.println("Round Score: " + (maxAttempts - attempts + 1));
            System.out.println("Total Score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("yes")) {
                rounds++;
            }

        } while (rounds < 3); // Change the number of rounds as needed

        System.out.println("Thanks for playing! Your final score is: " + totalScore);
        scanner.close();
    }

    private static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
