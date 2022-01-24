package week4lab;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BMI {
    private double weight;
    private double height;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double calculateBMI(){
        double weightInKilos = this.getWeight() * 0.45359237;
        double heightInMeters = this.getHeight() * 0.0254;
        double bmi = weightInKilos / pow(heightInMeters, 2);
        return bmi;
    }

    public String calculateInterpretation(){
        double bmi = this.calculateBMI();
        String interpretation = "";
        if (bmi < 18.5){
            interpretation = "Underweight";
        }
        else if (bmi < 25){
            interpretation = "Normal";
        }
        else if (bmi < 30){
            interpretation = "Overweight";
        }
        else {
            interpretation = "Obese";
        }

        return interpretation;
    }


}
