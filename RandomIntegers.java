package Cohort3.com.Examples;
// Program to shift and scale Random integers.
import  java.security.SecureRandom;

public class RandomIntegers {
    public static void main (String... args){
        // randomNumbers object will produce secure number
        SecureRandom randomNumbers = new SecureRandom();

        // Loop 20 times
        for (int counter = 1; counter <=20; counter++){
            // Pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            //if counter is divisible by 5, start counting
            if (counter % 5 ==0){
                System.out.println();
            }
        }
    }
}
