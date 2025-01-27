//MadLibs.Java

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask user a series of words
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = scanner.nextLine();

        //Create a predefined story and substitute the user inputs
        String story = "I am new to" + adjective + " " + noun + "decided to " + verb + "I am glad.";

        //Print the story
        System.out.println(story);



    }
}