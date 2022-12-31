package day06_ifStatements;

public class PracticeTask1_MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=25;
        int c=30;
        String result="";
        if(a>b &&a<c){
            result=a+" is the medium number";
        }
        if(b>a&&b<c){
            result=b+" is the medium number";
        }
        if(c>a &&c<b){
            result=c+" is the medium number";
        }
        System.out.println(result);

    }
}

/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
