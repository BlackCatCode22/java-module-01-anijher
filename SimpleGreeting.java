//SimpleGreeting.java

//Scanner class is here:
//https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to my Simple Greeting Project!\n\n");

        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Create a String variable to hold our user's name.
        String myUserName;

        //Prompt the user for their name.
        System.out.println("\n Please enter your name: ");

        //get the input into our variable
        myUserName = scanner.nextLine();

        //Prove that you got the user name.
        System.out.println("\n Hello " + myUserName + "how are you today?");




        }
    }