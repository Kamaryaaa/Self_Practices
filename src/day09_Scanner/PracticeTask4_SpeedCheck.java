package day09_Scanner;

import java.util.Scanner;

public class PracticeTask4_SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speedLimit = 100;


        System.out.println("Please, enter your current speed: ");
        int currentSpeed=input.nextInt();

        if(currentSpeed>speedLimit){
            System.out.println("You're driving "
                    +(currentSpeed-speedLimit)+" mph over the limit. Slow down!");
        }else {
            System.out.println("You are driving within the speed limit.");
        }
        input.close();



    }
}

/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print
	slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */
