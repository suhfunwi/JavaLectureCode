package week_2_loops;

import java.util.Random;

import static input.InputUtils.intInput;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        // generates random number for user to guess
        int secretNumber = random.nextInt(100) + 1;

        int guess = intInput("Guess the number!");

        while (guess != secretNumber) {
            System.out.println("That's wrong, try again!");

            if (guess < secretNumber) {
                System.out.println("Guess higher!");
            }
            if (guess > secretNumber) {
                System.out.println("Guess lower!");
            }
            guess = intInput("Guess the number!");
        }
//tells user to guess higher or lower based in the input and generated number
        System.out.println("Correct!");
    }
}
