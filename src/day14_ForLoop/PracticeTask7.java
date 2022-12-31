package day14_ForLoop;

import java.util.Scanner;

public class PracticeTask7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word=input.next().toLowerCase();
        boolean palindrome=true;

        input.close();

        for (int i = 0; i <word.length()-1 ; i++) {

            if(word.charAt(0)==word.charAt(word.length()-1)){
                 palindrome=true;
            }else {
                palindrome=false;
            }

        }
        System.out.println(palindrome);



    }
}
/*
 Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */