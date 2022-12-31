package day12_CustomMethosIntro;

public class PracticeTask5_daysOfMonth {
    public static void main(String[] args) {

        daysOfMonth("jUNe");


    }




    /*
    Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */

    public static void daysOfMonth(String month){
        month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();

        if(month.equals("January")||month.equals("March")||month.equals("May")||month.equals("July")||
        month.equals("August")||month.equals("October")||month.equals("December")){
            System.out.println(month+" has 31 days");
        }else if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November")){
            System.out.println(month+" has 30 days");
        }else if(month.equals("February")){
            System.out.println(month+" has 28 or 29 days");
        }else {
            System.err.println("Invalid month");
        }



    }
}
