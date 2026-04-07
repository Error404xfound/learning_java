import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attemptsTried = 1;
        int attemptsLimit = 5 + 1;
        int guessNumber = 0;
        int upperNumberLimit = 0;
        int lowerNumberLimit = 0;
        int randomNumber = 0;
        String mainBorder = "===============================";
        String subBorder  = "-------------------------------";

        System.out.printf("\n%s", mainBorder);
        System.out.println("\n  Random Number Guessing Game");
        System.out.println(mainBorder);

        System.out.print("\nEnter random generator number upper limit: ");
        upperNumberLimit = scanner.nextInt();
        System.out.print("Enter random generator number lower limit: ");
        lowerNumberLimit = scanner.nextInt();

        randomNumber = random.nextInt(lowerNumberLimit, upperNumberLimit + 1 );



        while (attemptsTried < attemptsLimit) {
            System.out.printf("\nAttempt %d\n", attemptsTried);
            System.out.println(subBorder);

            String range = "("+lowerNumberLimit+" - "+upperNumberLimit +")";

            System.out.printf("Enter your guess %s: ", range);
            guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("\nYou win! That's the right number!");
                break;
            }
            else if (guessNumber < randomNumber) {
                System.out.printf("\nThe correct number is higher than %d. Please try again.\n", guessNumber);
                lowerNumberLimit = guessNumber;
            }
            else {
                System.out.printf("\nThe correct number is lower than %d. Please try again.\n", guessNumber);
                upperNumberLimit = guessNumber;
            }

            attemptsTried += 1;
        }

        scanner.close();
    }
}
