package Cohort3.com.Examples;
//program to declare method maximum with three arguments
import java.util.Scanner;
public class MaximumFinder {
    public static void main(String... args) {
        //create Scanner for input from the command window
        Scanner input = new Scanner(System.in);
        //prompt a user to input three floating points
        System.out.print("Enter three floating-points Values");
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();


        //determine Maximum value
        double result = maximum(value1, value2, value3);
        System.out.println("Maximum is: " + result);
    }

    //returns the maximum of its three double parameter
    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        // determine whether y is greater than maximumValue
        if (y > maximumValue){
            maximumValue = y;
        }
        // determine whether z is greater than maximumValue
        if (z > maximumValue){
            maximumValue = z;
        }

        return maximumValue;
    }
}

