package day10_string;

import java.util.Scanner;

public class PracticeTask6_CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String first = input.next();
        System.out.println("Enter the second word");
        String second = input.next();

        if(first.charAt(first.length()-1)==second.charAt(0)){
            System.out.println(first+second.substring(1));
        }else {
            System.out.println(first+second);
        }

input.close();

    }
}
/*
Create a class named CombineWords. Ask user to enter two words.
Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter
    is the same, print that character once.

 */