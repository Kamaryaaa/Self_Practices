package day20_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseTheSecond {

    public static void main(String[] args) {

        String sentence="I Love Java";
        String reverseSecond="";

            String second = sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" "));

        for(int i=second.length()-1; i>=0;i--){
            reverseSecond +=(""+second.charAt(i));
        }

        String newSentence = sentence.replace(second,reverseSecond);
        System.out.println(newSentence);

        System.out.println("=======split()=======");
      String[] words = sentence.split(" ");
      String reversedSecond = "";
      String secondWord = words[1];
        System.out.println(Arrays.toString(words));
         for(int i=secondWord.length()-1; i>=0; i--){
             reversedSecond +=(""+secondWord.charAt(i));
         }

         words[1]=reversedSecond;

        System.out.println(Arrays.toString(words));


    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */
