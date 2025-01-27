//CharDetails.Java

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a single character
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        //Get the Unicode value of character
        int unicodeValue = (int) ch;

        //Check if it's a letter or digit
        String type;
        if (Character.isLetter(ch)) {
            type = "Letter";
        } else if (Character.isDigit(ch)) {
            type = "Digit";
        } else {
            type = "Neither letter nor digit";
        }

        //Display the results
        System.out.println("Character: " + ch);
        System.out.println("Unicode Value: " + unicodeValue);
        System.out.println("Type: " + type);








    }
}