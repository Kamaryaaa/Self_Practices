package day22_arrayList;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        System.out.println(Arrays.toString(ReplaceAll.replaceAll(arr,30,300)));


    }





    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        int[] newArray = new int[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
      return newArray;



    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        double[] newArray = new double[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;



    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        char[] newArray = new char[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;



    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        String[] newArray = new String[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;



    }







}
/*
 ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters:
        integer array, integer oldElement, integer newElement.
        The method replaces all the element of the array that matching with the given old element
        with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays

 */
