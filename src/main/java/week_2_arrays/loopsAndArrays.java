package week_2_arrays;

public class loopsAndArrays {
    public static void main(String[] args) {
// Create a string array initialized with data
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};
// Use a loop to print all the array data
// Notice the loop counter
        int x;
        for (x = 0; x < 6; x++) {
            System.out.println(classrooms[x]);
        }
    }
}