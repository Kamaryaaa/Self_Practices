package day15_whileLoop;

public class PracticeTask9_UniqueCharacters {
    public static void main(String[] args) {

    String input="AABCCD";
    String uniqueChar="";

        for (int i = 0; i < input.length(); i++) {
            char each=input.charAt(i);
            if(input.indexOf(each)==input.lastIndexOf(each)){
                uniqueChar+=each;
            }
        }
        System.out.println(uniqueChar);


    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters
from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */