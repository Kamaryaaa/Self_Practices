package day18_GarbageCollection;

public class PracticeTask1_HighestFrequency {
    public static void main(String[] args) {
          String str = "aaabbccccddeeee";
          char ch=str.charAt(0);


        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }

        }
        System.out.print((ch+count)+" ");





    }
}
/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */
