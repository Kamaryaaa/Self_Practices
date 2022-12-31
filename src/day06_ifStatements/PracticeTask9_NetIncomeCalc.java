package day06_ifStatements;

public class PracticeTask9_NetIncomeCalc {
    public static void main(String[] args) {

       double salary=70000;
       boolean isMarried=true;
       if(salary>=130000 && isMarried) {
           double taxRate = 0.35 - 0.05;
           double tax = salary * taxRate;
           double salaryAfterTax = salary - tax;
           System.out.println(salaryAfterTax);
       }
       if (salary>=130000 && !isMarried){
               double taxRate = 0.35;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);
           }
           if(salary>=100000 && salary<=129000 && isMarried){
               double taxRate = 0.30 - 0.05;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);
           }
           if (salary>=100000 &&salary<=129000&&!isMarried){
               double taxRate = 0.30;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);

           }
           if(salary>=80000 &&salary<=99000&&isMarried){
               double taxRate = 0.25-0.05;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);
           }
           if(salary>=80000 &&salary<=99000&&!isMarried){
               double taxRate = 0.25;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);
           }
           if(salary<=79000 &&isMarried){
               double taxRate = 0.20-0.05;
               double tax = salary * taxRate;
               double salaryAfterTax = salary - tax;
               System.out.println(salaryAfterTax);
           }
        if(salary<=79000 &&!isMarried){
            double taxRate = 0.20;
            double tax = salary * taxRate;
            double salaryAfterTax = salary - tax;
            System.out.println(salaryAfterTax);
        }









    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary
 after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */