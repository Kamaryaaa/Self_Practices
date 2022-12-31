package day15_whileLoop;

import java.util.Scanner;

public class PracticeTask3_FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a String and a char:");
        String str = input.nextLine();
        char ch=input.next().charAt(0);
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to
enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
