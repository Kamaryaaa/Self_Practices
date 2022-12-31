package day09_Scanner;

import java.util.Scanner;

public class PracticeTask2_Circle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        double p =3.14;
        double area = p*radius*radius;
        double perimeter = 2*p*radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close();


    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */