package day07_IfStatement_MultiBranchIfStatement_NestedIf;

public class PracticeTask3_CrewAndPassenger {
    public static void main(String[] args) {

        int number=75;
        int crew=20;
        int passenger=30;

        if(number==50|| number==75 || number==100){
            if(number==50){
                crew=20;
                passenger=30;
            }else if(number==75){
                crew=25;
                passenger=50;
            }else {
                crew=30;
                passenger=70;
            }
            System.out.println("passenger = " + passenger);
            System.out.println("crew = " + crew);
        }else {
            System.out.println("Not Valid");
        }














    }
}
/*
 Create a class called CrewAndPassenger, Given a number of people
 on the ship (int number), determine how many need to be crew members and how
 many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */