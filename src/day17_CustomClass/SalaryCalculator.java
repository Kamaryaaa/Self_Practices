package day17_CustomClass;

public class SalaryCalculator {





public double hourlyRate;
public double stateTaxRate,federalTaxRate;
public double weeklyHours;

    public void setInfo(double hourlyRate, int stateTaxRate, int federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
         return stateTaxRate/100;

    }

    public double federalTax(){
         return federalTaxRate/100;

    }

    public double salaryAfterTax(){
        return salary()-( salary()*(stateTaxRate/100+federalTaxRate/100) );
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=$"+salary()+
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", state tax="+stateTax()+",federal tax="+federalTax()+
                ", salaryAfterTax=$"+salaryAfterTax()+
                '}';
    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage,
            you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */