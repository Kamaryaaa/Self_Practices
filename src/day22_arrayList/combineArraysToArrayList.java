package day22_arrayList;

import java.util.ArrayList;

public class combineArraysToArrayList {
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
         String[] arr2 = {"D", "E", "F", "G"};
        combineArraysToArrayList.combine(arr1,arr2);




    }






    public static void combine(String[] array1, String[] array2){
        ArrayList <String> list = new ArrayList<>();

        for (String each : array1) {
            list.add(each) ;
        }
        for (String each : array2) {
            list.add(each);
        }
        System.out.println(list);
    }

}

/*
 write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
