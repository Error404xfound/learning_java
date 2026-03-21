import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double interestRate;
        double annualRate;
        int numberOfTimesPerYearCompounded;
        int numberOfYearsToCalculate;
        double totalBalanceAmount;
        double totalInvestmentEarned;

        System.out.print("Enter the principal amount (in $): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble();
        annualRate = interestRate / 100;

        System.out.print("Enter the number of times compounded per year: ");
        numberOfTimesPerYearCompounded = scanner.nextInt();

        System.out.print("Enter the duration of the investment in years: ");
        numberOfYearsToCalculate = scanner.nextInt();

        totalBalanceAmount = principal * Math.pow((1 + annualRate / numberOfTimesPerYearCompounded), numberOfTimesPerYearCompounded * numberOfYearsToCalculate);
        totalInvestmentEarned = totalBalanceAmount - principal;

        System.out.printf("\nThe total balance amount from your investment in %d years would be $%,.2f",numberOfYearsToCalculate, totalBalanceAmount);
        System.out.printf("\nThe total investment earned from your investment in %d years would be $%,.2f\n",numberOfYearsToCalculate, totalInvestmentEarned);

        scanner.close();
    }
}
