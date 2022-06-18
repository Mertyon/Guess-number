package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Code.GuessNumberGame();
    }


    public class Code {

        public static void
        GuessNumberGame() {

            // Scanner Class
            Scanner sc = new Scanner(System.in);

            // Generate Random Number
            int number = 1 + (int) (100
                    * Math.random());

            // Given X Trials
            int X = 5;

            int i, guess;

            System.out.println(
                    "A number is chosen"
                            + " between 1 to 100."
                            + "Guess the number"
                            + " within 5 trials.");

            // Iterate Over
            for (i = 0; i < X; i++) {

                System.out.println(
                        "Guess the number:");

                // User Input
                guess = sc.nextInt();

                // Guess Was Right
                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed right!");
                    break;
                } else if (number > guess
                        && i != X - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                } else if (number < guess
                        && i != X - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == X) {
                System.out.println(
                        "You have exhausted"
                                + " X trials.");

                System.out.println(
                        "The number was " + number);
            }
        }
    }
}
