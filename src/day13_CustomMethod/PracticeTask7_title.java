package day13_CustomMethod;

public class PracticeTask7_title {
    public static void main(String[] args) {
        title("JaVA");

    }

    /*
    Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the
    given argument

    Ex:
        title("jAvA") ===> Java
     */

    public static void title(String word){

        word=word.toUpperCase();

        word = word.substring(0,1)+word.toLowerCase().substring(1);

        System.out.println(word);



    }


}
