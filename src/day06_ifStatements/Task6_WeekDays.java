package day06_ifStatements;

public class Task6_WeekDays {
    public static void main(String[] args) {
        int number = 7;
        String result ="";

        if(number ==1){
            result="Monday";
        }if(number==2){
            result="Tuesday";
        }if(number==3){
            result="Wednesday";

        }if(number ==4){
            result="Thursday";
        }if(number==5){
            result="Friday";
        }
        if(number==6){
            result="Saturday";
        }
        if(number==7){
            result="Sunday";
        }
        System.out.println(result);

        int number1=20;
        byte number2 = (byte) number1;

        double number3 =number1;


    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable

 */
