import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double POUNDS_TO_KILOS_RATE = 0.45359237;
        final double KILOS_TO_POUNDS_RATE = 2.2046226218;

        String option;
        double amount;

        System.out.println("\n=====Weight Converter Program=====");
        System.out.println("1. Convert pound to kilograms");
        System.out.println("2. Convert kilograms to pound");
        System.out.println("3. Exit program\n");
        System.out.println("----------------------------------");
        System.out.print("Enter your selection (1/2/3): ");
        option = scanner.nextLine();

        if (option.equals("3")) {
            System.out.println("\nExiting Program...");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        System.out.println("\nWhat is the amount of weight you want to convert?");
        if (option.equals("1")) {
            System.out.print("Enter amount (pounds): ");
            amount = scanner.nextDouble();
            System.out.printf("\n%.2f pounds is equal to %.2f kilograms", amount, amount * POUNDS_TO_KILOS_RATE);
        }
        else if (option.equals("2")) {
            System.out.print("Enter amount (kilograms): ");
            amount = scanner.nextDouble();
            System.out.printf("\n%.2f kilograms is equal to %.2f pounds", amount, amount * KILOS_TO_POUNDS_RATE);
        }
        else {
            System.out.println("Invalid Input");
        }

        scanner.close();
    }
}
