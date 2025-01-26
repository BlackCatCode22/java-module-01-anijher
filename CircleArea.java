//CircleArea.Java

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double radius, area;
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the radius
        System.out.println("Enter the raduis of the circle: ");
        radius = scanner.nextDouble();

        //Calculate the formula for area
        area = Math.PI * radius * radius;

        //Print the calculated area
        System.out.println("\n The area of the circle is:" + area);





    }
}