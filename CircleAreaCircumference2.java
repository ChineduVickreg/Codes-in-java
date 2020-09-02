package Cohort3.com.Examples;
// Program to calculate the Area, Circumference and Volume of a Circle.

import java.util.Scanner;
public class CircleAreaCircumference2 {


    public double calculateArea(double radius){

        double area = 2 * Math.PI *radius *radius;
        return  area;
    }
    //return area;

    public double calculateCircumference(double radius ){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
   // return;

    public double calculateVolume(double radius ){

        double volume = 4.0/3.0 * Math.PI * radius;
        return  volume;
        }
        //return;
    public static void main(String[]args){
      CircleAreaCircumference2 myCircle = new CircleAreaCircumference2();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your radius");
        double myradius = obj.nextDouble();
        System.out.println(myCircle.calculateArea(myradius));
        System.out.println(myCircle.calculateCircumference(myradius));
        System.out.println(myCircle.calculateVolume(myradius));
    }
    }


