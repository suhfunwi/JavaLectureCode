package week_1_if_else;
import static  input.InputUtils.stringInput;
import static  input.InputUtils.doubleInput;
public class FirstIfStatement {

    //psvm shortcut
    public static void main(String[] args) {

        //Type this code
        //If errors, put cursor on StringInput and press Alt+Enter (PC)
        String message = stringInput("Enter some text");
        System.out.println("Thanks, your message was " +message);

        double price = doubleInput("Please enter the price of chips: ");
        // parentheses needed for if statements
        // DO NOT forget curly braces
        // choices made depend on the value of the variable
        if (price < 0) {
            System.out.println("That is an error, price can't be negative");
        } else if (price == 0) {
            System.out.println("They are free!");

        }
        else {

            System.out.println("Thanks, the price is $" + price);
        }
    }
}
