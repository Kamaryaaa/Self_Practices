package day09_Scanner;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter your legal age: ");
        byte age = input.nextByte();

        if(age>=21){
            System.out.println("Ypu are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
        input.close();

    }
}
/*
2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol
 */