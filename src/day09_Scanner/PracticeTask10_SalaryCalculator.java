package day09_Scanner;

import java.util.Scanner;

public class PracticeTask10_SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("Enter how many hours you work in a week:");
        double workingHours= input.nextDouble();

        System.out.println("Enter the state tax on percentage:");
        double stateTax = input.nextDouble();


        System.out.println("Enter the federal tax in percentage:");
        double federalTax=input.nextDouble();

        double salary = hourlyRate*workingHours*52;
        double stateTax1= salary*(stateTax/100);
        double federalTax1=salary*(federalTax/100);
        double totalTax = stateTax1+federalTax1;
        double netIncome = salary-totalTax;

        System.out.println("Your total salary before tax is salary: $" + salary);
        System.out.println("Your state tax rate is " + stateTax1);
        System.out.println("Your federal tax rate is " + federalTax1);
        System.out.println("Your total tax is $" + totalTax);
        System.out.println("Your net income after tax is $" + netIncome);

        input.close();





    }
}

/*
Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
