package day14_ForLoop;

import java.util.Scanner;

public class PracticeTask3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum=0;
        System.out.println("Enter a number:");
        double number = input.nextDouble();
        input.close();

        for (int i = 1; i <=number; i++) {
            sum+=i;

        }
        System.out.println("sum = " + sum);


    }
}
/*
 write a program that can calculate the sum of all numbers
 between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */