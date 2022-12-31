package day07_IfStatement_MultiBranchIfStatement_NestedIf;

public class PracticeTask5_AgeGroups {
    public static void main(String[] args) {

        int age=  55;
        String result="";
        if(age<21&& age>0 || age >=21 && age<55||age<=150&&age>=55){
            if(age<21 && age>0){
                result="Teenager";
            }else if(age>=21 &&age<55){
                result="Adult";
            }else {
                result="Senior";
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid");
        }

    }
}

/*
Create a class called AgeGroups, write a program that can define the age
groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
