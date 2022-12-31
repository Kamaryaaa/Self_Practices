package day07_IfStatement_MultiBranchIfStatement_NestedIf;

public class PracticeTask2_Browser {
    public static void main(String[] args) {

        String browserName="firefox";
        String selectedBrowser="";

        if(browserName=="chrome"|| browserName=="safari" || browserName=="opera"||
        browserName=="edge" || browserName=="firefox") {
            if (browserName == "chrome") {
                selectedBrowser = "chrome";
            } else if (browserName == "safari") {
                selectedBrowser = "safari";
            } else if (browserName == "opera") {
                selectedBrowser = "opera";
            } else if(browserName=="firefox"){
                selectedBrowser = "firefox";
            }else {
                selectedBrowser="edge";
            }
            System.out.println(browserName+" Browser is selected");
        }else {
            System.out.println("Invalid Browser Name");
        }






    }
}

/*
 Create a class called Browser. Write a program that can
 display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names,
        out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */
