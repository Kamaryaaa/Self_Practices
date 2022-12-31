package day22_arrayList;

import java.util.ArrayList;

public class MaxMinFromArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(2);
        list.add(32);
        list.add(4);
        list.add(10);

        Integer max=list.get(0);
        Integer min= list.get(0);

        for (Integer each : list) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }

        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);






    }






}
/*

8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */
