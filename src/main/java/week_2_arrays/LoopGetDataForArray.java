package week_2_arrays;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {


        String[] textbooks = new String[5];

        //loop repeats 5 times
        //starts counting from 0, same as array element numbers
        //can use the variable name to refer to the array elements
        // can use loop to read from or write to every array element in turn

        for (int number = 0 ; number < textbooks.length ; number++) {

            // get data about one book from user
            String bookName = stringInput("Please enter name of textbook");

            //Using the loop counter to write to each array element
            textbooks[number] = bookName;
        }

        System.out.println("Thank you: here is the data you entered");
        System.out.println(Arrays.toString(textbooks));
        for (int number = 0 ; number < textbooks.length ; number++)  {
            System.out.println("Book number " + (number + 1) + " is " + textbooks[number]);
        }
    }
}