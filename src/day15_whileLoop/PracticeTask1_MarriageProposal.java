package day15_whileLoop;

import java.util.Scanner;

public class PracticeTask1_MarriageProposal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer. Please re-enter");
            answer=input.next();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats!!!!");
        }
        if(answer.equals("no")){
            System.out.println("GoodBye");
        }

        input.close();








    }
}
/*
  Create a class named Marriage proposal and Write a program for the
  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter"
    and repeat it until the user enters either yes or no
 */