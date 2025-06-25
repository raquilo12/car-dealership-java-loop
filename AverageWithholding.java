// AverageWithholding.java
import java.util.Scanner;

public class AverageWithholding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt user for weekly income
            System.out.print("Enter your weekly income: $");
            double income = scanner.nextDouble();

            double taxRate;

            // Determine tax rate based on income brackets
            if (income < 500) {
                taxRate = 0.10;
            } else if (income < 1500) {
                taxRate = 0.15;
            } else if (income < 2500) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            // Calculate tax withholding
            double withholding = income * taxRate;

            // Display results
            System.out.printf("Tax Rate: %.0f%%\n", taxRate * 100);
            System.out.printf("Weekly Withholding: $%.2f\n", withholding);

        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}
