package day09_Scanner;

import java.util.Scanner;

public class PracticeTask3_GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        String grade =(score<=100 &&score>=90)?"A":(score>=80 &&score<90)?"B":(score>=70&&score<80)?"C"
                :(score>=60 && score<70) ?"D" :(score>=0 && score<60)?"F" :"Invalid score";
        System.out.println(grade);

        input.close();
    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */