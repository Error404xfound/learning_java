import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1;
        double side2;
        double hypotenuse;

        System.out.println("---Albus' Hypotenuse Calculator---");

        System.out.print("Enter side 1 (cm): ");
        side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (cm): ");
        side2 = scanner.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        System.out.println("\nThe hypotenuse is " + String.format("%.2f", hypotenuse) + " cm");

        scanner.close();
    }
}
