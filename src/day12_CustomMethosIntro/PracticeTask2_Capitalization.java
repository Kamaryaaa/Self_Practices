package day12_CustomMethosIntro;

public class PracticeTask2_Capitalization {
    public static void main(String[] args) {

     capitalization("cyDeO", "sCHooL");


    }

    /*
    Create a method named capitalization that can format the first and last
    names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
     */
    public static void capitalization(String firstName, String lastname){
        firstName=firstName.toLowerCase();
        lastname=lastname.toLowerCase();
        String fullName = firstName.substring(0,1).toUpperCase()+firstName.substring(1)+
                " "+lastname.substring(0,1).toUpperCase()+lastname.substring(1);
        System.out.println(fullName);


    }


}
