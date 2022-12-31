package day09_Scanner;

import java.util.Scanner;

public class PracticeTask9_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char mathOperator = input.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        double calculator=0;
        switch (mathOperator) {
            case '+':
                calculator = num2 + num1;
                break;
            case '-':
                calculator=num1-num2;
                break;
            case '*':
                calculator=num1*num2;
                 break;
            case '/':
                calculator=num1/num2;
                break;
            default:
                System.out.println("Invalid entry");
        }

        input.close();



    }
}
/*
9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */
