package day08_Ternary_Switch;

public class PracticeTask9_Browser {
    public static void main(String[] args) {

        String browserName="chrome";
        String result="You selected: "+browserName+" browser";

        switch (browserName){
            case "safari":
            case "chrome":
            case"firefox":
            case "opera":
            case "edge":
                break;
            default:
                result="Invalid Browser";

        }
        System.out.println(result);




    }
}
/*
write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put
            should be: Invalid Browser

        	Do Not use if statement or ternary

 */