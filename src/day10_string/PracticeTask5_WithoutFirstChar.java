package day10_string;

import java.util.Scanner;

public class PracticeTask5_WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String first = input.next();
        System.out.println("Enter second word:");
        String second =input.next();

        first = first.substring(1);
        second = second.substring(1);

        System.out.println(first+second);

        input.close();





    }
}
/*
Create a class named WithoutFirstChar. Ask user to enter two words.
Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

 */