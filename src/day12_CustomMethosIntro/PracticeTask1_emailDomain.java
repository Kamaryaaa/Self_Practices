package day12_CustomMethosIntro;

public class PracticeTask1_emailDomain {
    public static void main(String[] args) {

        domain("Cydeo@gmail.com");
    }
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */

    public static void domain(String email){

        String domain =email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain: "+domain);



    }





}
