package day12_CustomMethosIntro;

public class PracticeTask6_eligibleToVote {
    public static void main(String[] args) {
eligibleToVote(23,false);
    }



    /*

6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
     */

    public static void eligibleToVote(int age, boolean isAmerican){
        if(age>=18 && isAmerican==true){
            System.out.println("You are eligible to vote in America");
        }else {
            System.out.println("You are not eligible to vote in America");
        }





    }
}
