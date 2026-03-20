import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double hypotenuse;

        System.out.println("---Albus' Hypotenuse Calculator---");

        System.out.print("Enter number 1 (cm): ");
        num1 = scanner.nextDouble();

        System.out.print("Enter number 2 (cm): ");
        num2 = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2));
        System.out.println("\nThe hypotenuse is " + String.format("%.2f", hypotenuse) + " cm");

        scanner.close();
    }
}
