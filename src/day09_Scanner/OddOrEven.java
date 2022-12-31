package day09_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        byte num= input.nextByte();

        if(num%2==0){
            System.out.println("You entered even number");
        }else {
            System.out.println("You entered odd number");
        }

        input.close();



    }
}
/*
1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */