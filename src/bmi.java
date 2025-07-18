


import java.util.Scanner;

public class bmi{


    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println("Hi, welcome!");

        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.print("Please enter your weight (in kilograms): ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        input.close();
    }

}