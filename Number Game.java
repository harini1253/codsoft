import java.util.Random;
import java.util.Scanner;

 class NumberGuessingGame {

    public static void main(String[] args) {
        playMultipleRounds();
    }

    private static void guessTheNumber() {
        // Step 1: Generate a random number within the specified range
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Step 5: Set the maximum number of attempts
        int maxAttempts = 10;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            // Step 2: Prompt the user to enter their guess
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = scanner.nextInt();

            // Step 3: Compare the user's guess and provide feedback
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                        " in " + (attempts + 1) + " attempts.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            attempts++;
        }

        // Step 7: Display the user's score based on attempts
        System.out.println("Your final score: " + (maxAttempts - attempts) + " points");
    }

    // Step 6: Add the option for multiple rounds
    private static void playMultipleRounds() {
        Scanner scanner = new Scanner(System.in);

        do {
            guessTheNumber();
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));
    }
}
