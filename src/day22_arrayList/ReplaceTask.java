package day22_arrayList;

import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {
        int[] array ={10,30,50,65};
        int index=0;
        int newElement=30;
        int[] newArray=ReplaceTask.replace(array,index,newElement);
        System.out.println(Arrays.toString(newArray));



    }

    public static int[] replace(int[] array, int index, int newElement){

        int[] newArray = new int[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(i == index){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;
    }

    public static double[] replace(double[] array, int index, double newElement){

        double[] newArray = new double[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(i == index){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;
    }

    public static char[] replace(char[] array, int index, char newElement){

        char[] newArray = new char[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(i == index){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;
    }

    public static String[] replace(String[] array, int index, String newElement){
        String[] newArray = new String[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++,k++) {
            if(i == index){
                array[i]=newElement;
            }
            newArray[k]=array[i];

        }
        return newArray;
    }








}
/*
 1.1 Create a method named replace that passes three parameters:
 integer array, integer index, integer newElement. The method replaces the element of the array
 at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */
