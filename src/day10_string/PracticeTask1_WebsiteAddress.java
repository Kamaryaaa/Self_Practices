package day10_string;

import java.util.Scanner;

public class PracticeTask1_WebsiteAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
     String website = input.nextLine();
     if(website.contains("www.")&&website.endsWith(".com")|| website.endsWith(".edu")
             || website.endsWith(".gov")){
         System.out.println("The website address is valid");
     }else{
         System.err.println("The website address is not valid");
     }
     input.close();




    }
}
/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
        starts with: www.
        ends with: .com, .edu, .gov


 */