package day22_arrayList;

import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(SwapTask.swap(array,0,1)));//{20,10,30,40,50}




    }

    public static int[] swap(int[] array, int i, int j){
        int[] newArray = new int[array.length];
        int c=0;
        int z=array[i];

        for (int k = 0; k < array.length; k++,c++) {
            if(k==i){
                array[k]=array[j];
            }
            if(k==j){
                array[k]=z;
            }

            newArray[c]=array[k];

        }


       return newArray;

    }

    public static double[] swap(double[] array, int i, int j){
        double[] newArray = new double[array.length];
        int c=0;
        double z=array[i];

        for (int k = 0; k < array.length; k++,c++) {
            if(k==i){
                array[k]=array[j];
            }
            if(k==j){
                array[k]=z;
            }

            newArray[c]=array[k];

        }


        return newArray;

    }

    public static char[] swap(char[] array, int i, int j){
        char[] newArray = new char[array.length];
        int c=0;
        char z=array[i];

        for (int k = 0; k < array.length; k++,c++) {
            if(k==i){
                array[k]=array[j];
            }
            if(k==j){
                array[k]=z;
            }

            newArray[c]=array[k];

        }


        return newArray;

    }

    public static String[] swap(String[] array, int i, int j){
        String[] newArray = new String[array.length];
        int c=0;
        String z=array[i];

        for (int k = 0; k < array.length; k++,c++) {
            if(k==i){
                array[k]=array[j];
            }
            if(k==j){
                array[k]=z;
            }

            newArray[c]=array[k];

        }


        return newArray;

    }









}
/*
Swap Task:
    2.1 Create a method named swap that passes three parameters:
     integer array, integer i, integer j. the method swaps the element at index
     i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
 */