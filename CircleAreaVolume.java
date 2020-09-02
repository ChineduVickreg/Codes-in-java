package Cohort3.com.Examples;
//Program to calculate the Area and circumference of a Circle
import java.util.Scanner;

public class CircleAreaVolume {
    public  static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = obj.nextDouble();

       // double myPi = Math.PI;
        double area = 2 * Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        double volume = 4.0/3.0 * Math.PI * radius;
        System.out.printf("\nArea, ,%f%n ", area);
        System.out.printf("\nCircumference, %f%n ", circumference);
        System.out.printf("\nvolume, %f%n ", volume);
    }
    //public static  void  main(String[]args){
      //  CircleAreaVolume myCirc = new CircleAreaVolume();
        //myCirc.myCircle();
   // }
}
