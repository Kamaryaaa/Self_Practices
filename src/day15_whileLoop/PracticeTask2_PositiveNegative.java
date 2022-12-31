package day15_whileLoop;

import java.util.Enumeration;
import java.util.Scanner;

public class PracticeTask2_PositiveNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int positiveCount=0;
        int negativeCount=0;


        for (int i = 1; i <6 ; i++) {
            System.out.println("Please enter a number:");
            int number=input.nextInt();
            if (number>0) {
                positiveCount++;
            }
                if(number<0){
                    negativeCount++;
                }
            }


        System.out.println(positiveCount+" positive"+" and "+negativeCount+" negative");


input.close();






    }
}
/*
 Create a class named PositiveNegative and write a program that asks user to enter number for
 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
