package day19_ArraysIntro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        String reversedArray="";
        for (int i = array.length - 1; i >= 0; i--) {
          reversedArray += array[i];
        }
        System.out.println("reversedArray = " + "{ "+reversedArray+" }");
    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */
