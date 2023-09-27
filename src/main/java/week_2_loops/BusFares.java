package week_2_loops;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {
        //an array with the names of the days to create questions for the user
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        double total = 0;

        for (int day = 0; day < dayNames.length; day++) {
            String dayName = dayNames[day];

            double dayExpense = doubleInput("On " + dayName + ", what did you spend on bus fares?");
                total = total + dayExpense; // add the days expense to the total
            }
            System.out.println("For the week, you spent $" + total + " for bus fares.");
        }
    }
