package week4lab;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI bmi1 = new BMI(weight, height);
        System.out.println("BMI is " + bmi1.calculateBMI());
        System.out.println(bmi1.calculateInterpretation());

    }
}
