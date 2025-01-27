//SimpleCalculator.Java

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //Perform basic arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        //Display the results
        System.out.println("The addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("The subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("The multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("The division: " + num1 + " / " + num2 + " = " + division);




    }
}