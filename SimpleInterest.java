//SimpleInterest.Java

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user for principle, rate, and time
        System.out.print("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        //Calculate the simple interest
        double simpleInterest = (principle * rate * time) / 100;

        //Print the result
        System.out.println("\n The simple interest is: " + simpleInterest);

        scanner.close();

    }
}