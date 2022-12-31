package day10_string;

import java.util.Locale;
import java.util.Scanner;

public class PracticeTask7_printName {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstName = input.nextLine();
        System.out.println("Enter the last name:");
        String lastName = input.nextLine();

        firstName = firstName.toUpperCase();
        lastName=lastName.toUpperCase();

        String firstSub=firstName.substring(1);
        firstSub=firstSub.toLowerCase();

        String lastSub = lastName.substring(1);
        lastSub=lastSub.toLowerCase();

        char firstLetterOfFirstName = firstName.charAt(0);
        char firstLetterOfLastName = lastName.charAt(0);

        System.out.println(firstLetterOfFirstName+firstSub+" "+firstLetterOfLastName+lastSub);


 */
        System.out.println("==========================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstName = input.nextLine().toLowerCase();
        System.out.println("Enter the last name:");
        String lastName = input.nextLine().toLowerCase();

        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);

        System.out.println(firstName+" "+lastName);





        input.close();







    }
}
/*
Write a program that asks user to enter first and last names,
and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */