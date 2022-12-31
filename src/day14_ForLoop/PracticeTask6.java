package day14_ForLoop;

import java.util.Scanner;

public class PracticeTask6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word=input.nextLine();
        input.close();
        double sum=0;

        for (int i = 0; i <=word.length()-1 ; i++) {
            if (word.charAt(i)>=48&&word.charAt(i)<=57){
                int number=word.charAt(i)-48;
                sum+=number;
            }

        }
        System.out.println("sum = " + sum);

    }
}




/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */
