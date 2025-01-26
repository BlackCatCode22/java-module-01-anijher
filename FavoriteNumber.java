//FavoriteNumber.Java

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.print("Please enter your favorite number: ");

        int favoriteNumber = scanner.nextInt();

        //Print a message along with user's favorite number
        System.out.println("Your favorite number is: " + favoriteNumber);

        //Close the scanner
        scanner.close();

    }
}