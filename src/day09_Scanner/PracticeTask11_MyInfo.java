package day09_Scanner;

import java.util.Scanner;

public class PracticeTask11_MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age =input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();

        System.out.println("Enter your school name:");
        String schoolName=input.nextLine();



        input.nextLine();
        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName=input.next();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);

        System.out.println("Address:\n\t"+buildingNumber+" "+streetName+"\n\t"+cityName+", "+stateName+
                " "+zipCode);
        System.out.println("schoolName = " + schoolName);
               input.close();
    }
}
/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name
 */