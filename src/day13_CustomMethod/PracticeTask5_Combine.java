package day13_CustomMethod;

public class PracticeTask5_Combine {
    public static void main(String[] args) {
combine("second","eight");

    }

    /*
    Create a method named combine that can take two string and
    then add them together and returns it.
        But if the last letter of the first word and the
        first letter of the last letter are the same, return that
        character once.
    Ex:
        combine("one", "eight")  ==> oneight
     */

    public static void combine(String word1, String word2){

if(word1.charAt(word1.length()-1)==word2.charAt(0)){
    System.out.println(word1+word2.substring(1));
}else{
    System.out.println(word1+word2);
}


    }







}
