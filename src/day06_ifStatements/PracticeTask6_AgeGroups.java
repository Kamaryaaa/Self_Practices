package day06_ifStatements;

public class PracticeTask6_AgeGroups {
    public static void main(String[] args) {

        int age =25;
        String result="";
        if(age>=1&&age>=2){
            result="the age group is Infant";
        }if(age>=3 &&age<=5){
            result="the age group is toddler";
        }
        if(age>=6 &&age<=9){
            result="the age group is Kid";
        }
        if(age>=10 &&age<=12){
            result="the age group is pre-teen";
        }
        if(age>=13 && age<=17){
            result="teh age group is teenager";
        }
        if(age>=18 && age<=20){
            result="the age group is young adult";
        }
        if(age>=21&&age<=39){
            result="the age group is adult";
        }
        if(age>=40&& age<=49){
            result="the age group is young middle age adult";
        }
        if(age>=50 && age<=54){
            result="the age group is middle-aged adult";
        }
        if(age>=55 && age<=64){
            result="the age group is very young senior citizen";
        }
        if(age>=65 && age<=74){
            result="the age group is young senior citizen";
        }
        if(age>=75 &&age<=84){
            result="the age group is Senior citizen";
        }
        if (age>=85){
            result="the age group is old senior citizen";
        }
        System.out.println(result);

    }
}

/*
Create a class named AgeGroups, an integer variable named age is declared and given.
write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */