package Variables;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = height / (weight * weight);
        sc.close();
        if (bmi < 15.00) {
            System.out.printf("Very severely underweight");
        } else if (bmi >= 15.00 && bmi < 16.00) {
            System.out.printf("Severely underweight");
        } else if (bmi >= 16.00 && bmi < 18.50) {
            System.out.printf("Underweight");
        } else if (bmi >= 18.50 && bmi < 25.00) {
            System.out.printf("Normal");
        } else if (bmi >= 25.00 && bmi < 30.00) {
            System.out.printf("Overweight");
        } else if (bmi >= 30.00 && bmi < 35.00) {
            System.out.printf("Moderately obese");
        } else if (bmi >= 35.00 && bmi < 40.00) {
            System.out.printf("Severely obese");
        } else if (bmi >= 40.00) {
            System.out.printf("Very severely obese");
        }
    }
}



