package day15_whileLoop;

import java.util.Scanner;

public class PracticeTask7_Login {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String userName="Cydeo";
        String password="Cydeo123";
        int count=3;

        System.out.println("Enter your username:");
        String u=input.nextLine();

        System.out.println("Enter your password:");
        String p =input.nextLine();

        while(!(userName.equals(u)&& password.equals(p))){
            System.err.println("Wrong user name or password. Please re-enter:");
            System.out.println("Enter your username:");
            u=input.nextLine();
            System.out.println("Enter your password:");
            p=input.nextLine();
            count--;
            if (count==0){
                System.out.println("Your account locked");
                break;
            }

        }
        if(userName.equals(u)&&password.equals(p)){
            System.out.println("Logged in");
        }

        input.close();






    }
}
/*
you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter correct credentials and if all three
                attempts are failed, then print "Your account is lucked."

 */
