package day12_CustomMethosIntro;

public class PracticeTask4_dayName {
    public static void main(String[] args) {

        dayName(10);
    }
    /*Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

     */
    public static void dayName(int dayNumber){
        String dayName = (dayNumber==1)?"Monday" :(dayNumber==2)?"Tuesday" :(dayNumber==3)?"Wednesday"
                :(dayNumber==4)?"Thursday" :(dayNumber==5)?"Friday":(dayNumber==6)?"Saturday"
                :(dayNumber==7)?"Sunday":"Invalid Number";
        System.out.println(dayName);
    }
}
