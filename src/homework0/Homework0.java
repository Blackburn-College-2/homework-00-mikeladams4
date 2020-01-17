package homework0;

import java.util.Scanner;

/**
 * A program that has you guess a randomly selected meal.
 *
 * @author Mikel Adams 1/17/2020
 */
public class Homework0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] foods = new String[3];
        String[] guesses = new String[3];
        foods[0] = "shrimp";
        foods[1] = "tacos";
        foods[2] = "sushi";
        int d = (int) (Math.random() * 3);
        String answer = foods[d];
        System.out.println("The secreat meal must be one of the following");
        System.out.println("shrimp");
        System.out.println("tacos");
        System.out.println("sushi");
        System.out.println("Guess the secret meal:");
        String guess1 = input.nextLine();
        if (guess1.equalsIgnoreCase(answer)) {
            System.out.println("Correct! You win.");
            System.exit(0);
        } else if (!(guess1.equalsIgnoreCase("sushi") || guess1.equalsIgnoreCase("shrimp") || guess1.equalsIgnoreCase("tacos"))) {
            System.out.println("Thats not an option! You lose.");
            System.exit(0);
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("Guess the secret meal:");
        String guess2 = input.nextLine();
        if (guess2.equalsIgnoreCase(guess1)) {
            System.out.println("You already guessed that! Wrong! You lose.");
            System.exit(0);
        } else if (guess2.equalsIgnoreCase(answer)) {
            System.out.println("Correct! You win.");
            System.exit(0);
        } else if (!(guess2.equalsIgnoreCase("sushi") || guess2.equalsIgnoreCase("shrimp") || guess2.equalsIgnoreCase("tacos"))) {
            System.out.println("Thats not an option! You lose.");
            System.exit(0);
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("Guess the secret meal:");
        String guess3 = input.nextLine();
        if (guess3.equalsIgnoreCase(guess1)) {
            System.out.println("You already guessed that! Wrong! You lose.");
            System.exit(0);
        } else if (guess3.equalsIgnoreCase(guess2)) {
            System.out.println("You already guessed that! Wrong! You lose.");
            System.exit(0);
        } else if (guess3.equalsIgnoreCase(answer)) {
            System.out.println("Correct! You win.");
            System.exit(0);
        } else if (!(guess3.equalsIgnoreCase("sushi") || guess3.equalsIgnoreCase("shrimp") || guess3.equalsIgnoreCase("tacos"))) {
            System.out.println("Thats not an option! You lose.");
            System.exit(0);
        }
    }

}
