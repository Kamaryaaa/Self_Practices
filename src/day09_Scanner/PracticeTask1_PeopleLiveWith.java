package day09_Scanner;

import java.util.Scanner;

public class PracticeTask1_PeopleLiveWith {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How many people in your family?");
        int peopleNumber = input.nextInt();

        if(peopleNumber<=3){
            System.out.println("Live with less than 3 people");
        }else if(peopleNumber>3 && peopleNumber<=6){
            System.out.println("Live with 3-6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }

        input.close();







    }
}
/*

1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
