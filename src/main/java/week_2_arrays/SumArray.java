package week_2_arrays;

public class SumArray {
    public static void main(String[] args) {
        //create a double array to store 3 numbers
        double numbers[] = new double[3];
        // add test data
        numbers[0] = 45.5678;
        numbers[1] = 237.22;
        numbers[2] = 981.7855;
        // when adding data, you need a start point, adding the values starts at 0.
        double sum = 0.0;
        //Loop over the array, and add each value up to the sum variable.\
        for (int x = 0 ; x < numbers.length ; x++) {
            sum = sum + numbers[x];
        }
        System.out.println("Total of numbers = " + sum);
    }
}
