package day20_ForEachLoop;

public class CountPalindrome {
    public static void main(String[] args) {
      String[] words = {"anna", "level", "Java"};
      int count=0;

        for (String each : words) {
            if(each.charAt(0)==each.charAt(each.length()-1)){
                count++;
            }
        }
        System.out.println(count);


    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
