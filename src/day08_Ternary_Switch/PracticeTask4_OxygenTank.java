package day08_Ternary_Switch;

public class PracticeTask4_OxygenTank {
    public static void main(String[] args) {

        int oxygenLevel=105;

        String result = (oxygenLevel>=90)?"Your tank is full"
                :(oxygenLevel>=80&&oxygenLevel<90)? "Still okay"
                :(oxygenLevel>=70&&oxygenLevel<80)?"Don't go too far"
                :(oxygenLevel>=60&&oxygenLevel<70)?
                "Start to head back":(oxygenLevel>=50 &&oxygenLevel<60)?
                "Be careful now you at 50%"
                :"invalid oxygen level";
        System.out.println(result);





    }
}
/*
    Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at 50%

        USE ONE PRINT STATEMENT ONLY

        Solution 1: Must use ternary

 */
