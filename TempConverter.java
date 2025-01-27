//TempConverter.Java

//Convert the temperature from Fahrenheit to Celsius

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to inter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Convert the temperature from Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        //Print the celsius temperature
        System.out.printf("\n The temperature in Celsius is: %.2f%n", celsius);





    }
}