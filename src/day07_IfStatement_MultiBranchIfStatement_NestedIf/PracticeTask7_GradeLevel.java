package day07_IfStatement_MultiBranchIfStatement_NestedIf;

public class PracticeTask7_GradeLevel {
    public static void main(String[] args) {

        byte number=9;
        String result="";
        if(number>=1&&number<=5 || number>=6 &&number<=8 || number>=9 && number<=12
        || number>=13 && number<=16 || number>=17&&number<=18){
            if(number>=1&&number<=5){
                result="Elementary School";
            }else if(number>=6 &&number<=8){
                result="Middle School";
            }else if(number>=9 && number<=12){
                result="High school";
            }else if(number>=13 && number<=16){
                result="College";
            }else {
                result="Grad School";
            }
            }else {
            result="Invalid grade level given";
        }
        System.out.println(result);




    }
}

/*
Create a class called GradeLevel, Given a number(byte)
grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
