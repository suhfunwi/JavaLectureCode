package week_2_arrays;

public class arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 56;

        String[] classnames = {"Java", "C#", "Web", "Android", "iOS"};
//        classnames[0] = "Java";
//        classnames[1] = "C#";
//        classnames[2] = "Web";

        System.out.println("One of the second year classes is " + classnames[2]);

        int numberofClasses = classnames.length;
        System.out.println("There are " + numberofClasses + " classes");

        for (int x = 0; x < classnames.length; x++) {
            System.out.println("A class name is " + classnames[x]);

            
        }
    }
}