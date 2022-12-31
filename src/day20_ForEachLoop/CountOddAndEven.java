package day20_ForEachLoop;

public class CountOddAndEven {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,0,12,13,14,15,16,67,68,69,60,100,200,300,500,900,700};
        int countOdd=0;
        int countEven=0;

        for (int each : array) {
            if(each%2 ==0){
                countEven++;
            }
            if(each %2 !=0){
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);




    }
}
//  Write a program that can count the even and odd number from an array of integers
//
//			Note: MUST use for each loop
