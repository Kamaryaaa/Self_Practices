package day14_ForLoop;

import java.util.Scanner;

public class PracticeTask5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        input.close();
        String letters ="";
        String digits="";
        String specialCharacters="";

        for (int i = 0; i <=word.length()-1; i++) {
            if(word.charAt(i)>=65&&word.charAt(i)<=90 || word.charAt(i)>=97&&word.charAt(i)<=122){
                letters+=word.charAt(i);
            }else if(word.charAt(i)>=48&&word.charAt(i)<=57){
                 digits+=word.charAt(i);
            }else {
                specialCharacters+=word.charAt(i);
            }

        }
        System.out.println("Letters: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Special Character: "+specialCharacters);






    }
}
/*


    write a program that can retrive the digits, letters and special characters from a string
            Ex:
                    input:
                    mn@#123Ab!

        output:
        letters: mnAb
        digits: 123
        special chars: @#!

        */
