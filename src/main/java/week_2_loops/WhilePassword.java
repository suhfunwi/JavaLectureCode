package week_2_loops;

import static input.InputUtils.stringInput;

public class WhilePassword {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        System.out.println();
        String userPassword = stringInput("Enter the password");

        int maxGuesses = 5;

        //Make sure to use .equals to make sure two strings match perfectly
        //Loop repeats if the password is not kittens(secretPassword)
        while ( ! userPassword.equals (secretPassword) && maxGuesses > 1) {
            //wrong password, print error message
            System.out.println("Password incorrect, access denied.");
            //ask user to try again
            System.out.println("Try again");
            //Replace userPassword with the user's next attempt
            userPassword = stringInput("Enter the password");
            maxGuesses--;
            //if its wrong again it repeats
            // false loop condition means the password is correct

        }
        if (maxGuesses > 1) { //ran out of guesses
            System.out.println("Correct password - access granted");
        }

        else  {
            System.out.println("Max number of password attempts. ");
            System.exit(0);
        }

        //print "access granted" method



    }
}
