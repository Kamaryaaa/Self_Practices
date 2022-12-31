package day13_CustomMethod;

public class PracticeTask6_frequencyOfWord {
    public static void main(String[] args) {

frequencyOfWord("Java java jAvA","java","javaa");
    }
    /*
    Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4

     */
    public static void frequencyOfWord(String sentence, String word,String word1){

        String result=sentence.toLowerCase().replace(word.toLowerCase(),word1.toLowerCase());
        int count =result.length()-sentence.length();

        System.out.println(count);





    }



}
