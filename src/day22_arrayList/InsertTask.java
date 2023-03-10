package day22_arrayList;

import java.util.Arrays;

public class InsertTask {
    public static void main(String[] args) {

        int[] array={10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(InsertTask.insert(array,2,100)));



    }



    public static int[] insert(int[] array, int index, int element){
        int[] newArray = new int[array.length+1];
        for (int i = 0,k=0; i < array.length; i++,k++) {
            if(i==index){
                newArray[k]=element;
                k++;
            }
            newArray[k]=array[i];


        }



     return newArray;

    }

    public static double[] insert(double[] array, int index, double element){
        double[] newArray = new double[array.length+1];
        for (int i = 0,k=0; i < array.length; i++,k++) {
            if(i==index){
                newArray[k]=element;
                k++;
            }
            newArray[k]=array[i];


        }



        return newArray;

    }

    public static char[] insert(char[] array, int index, char element){
        char[] newArray = new char[array.length+1];
        for (int i = 0,k=0; i < array.length; i++,k++) {
            if(i==index){
                newArray[k]=element;
                k++;
            }
            newArray[k]=array[i];


        }



        return newArray;

    }

    public static String[] insert(String[] array, int index, String element){
        String[] newArray = new String[array.length+1];
        for (int i = 0,k=0; i < array.length; i++,k++) {
            if(i==index){
                newArray[k]=element;
                k++;
            }
            newArray[k]=array[i];


        }



        return newArray;

    }








}
/*
 Insert Task:
        1.1 Create a method named insert that passes three parameters:
        integer array, integer index, integer element. the method inserts the given element to
        the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array

 */