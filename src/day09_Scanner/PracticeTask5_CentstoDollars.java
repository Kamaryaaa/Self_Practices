package day09_Scanner;

import java.util.Scanner;

public class PracticeTask5_CentstoDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents: ");
        int cents = input.nextInt();

        int dollar= cents/100%100;
        int remainingCents = cents%100;

        System.out.println(cents+" cents equal to: "+dollar+" dollars and "
                +remainingCents+" cents");
        input.close();


    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */
