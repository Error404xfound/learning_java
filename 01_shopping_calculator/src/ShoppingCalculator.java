import java.util.Locale;
import java.util.Scanner;

public class ShoppingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 12.90;
        int quantity;
        double total;

        System.out.println("What food item would you like to buy?");
        System.out.print("(Input): ");
        String item = scanner.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("\nThe price of a " + item + " is $" + String.format("%.2f", price));
        System.out.println("How many " + item + "s would you like to buy?");
        System.out.print("(Input): ");

        quantity = scanner.nextInt();
        total = quantity * price;
        System.out.println("\nYou just bought " + quantity + " " + item + "s");
        System.out.println("Your total is $" + String.format("%.2f", total));
        System.out.println("\nThanks for using!");

        scanner.close();
    }
}