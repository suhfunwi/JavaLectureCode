package week_2_loops;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class BooleanWhileLoop {
    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        // Loop repeats as long as user wants to do calculations

        while (moreCalculations) {

            price = doubleInput("Type in a price");
            double princeInclTax = price * salesTax;
            System.out.println("The price plus sales tax is " + princeInclTax);

            //user determines if they want to continue the loop
            //moreCalculations variable used in while loop condition
            moreCalculations = yesNoInput("Do you want to continue?");
        }

        System.out.println("Thanks for using the program - goodbye!");
    }
}
