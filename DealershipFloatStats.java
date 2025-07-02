// DealershipFloatStats.java
import java.util.Scanner;

public class DealershipFloatStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        float total = 0, max = Float.MIN_VALUE, min = Float.MAX_VALUE;

        System.out.println("Car Dealership Data Entry - Enter 5 floating-point values (e.g., vehicle service costs or fuel efficiency ratings):");

        while (count < 5) {
            System.out.print("Enter value " + (count + 1) + ": ");
            if (scanner.hasNextFloat()) {
                float value = scanner.nextFloat();
                total += value;
                if (value > max) max = value;
                if (value < min) min = value;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // clear invalid input
            }
        }

        float average = total / 5;
        float interest = total * 0.2f;

        System.out.printf("Total of all values: $%.2f\n", total);
        System.out.printf("Average: $%.2f\n", average);
        System.out.printf("Maximum value: $%.2f\n", max);
        System.out.printf("Minimum value: $%.2f\n", min);
        System.out.printf("Interest on total at 20%%: $%.2f\n", interest);
    }
}

