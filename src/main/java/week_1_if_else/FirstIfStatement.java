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
        System.out.println("Thanks, the price is $" + price);
    }
}
