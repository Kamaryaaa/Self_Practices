package day20_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

       /* String str = "aaabbccccddeeeeffm";

        String result = "";//"bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);// each character of str
            int count =0;

            for (int i = 0; i <str.length() ; i++) { // responsible for comparing ch to
                // each character of str and return the frequency of ch
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            if(count==1&& !result.contains(""+ch)){
                result+=ch;
            }
        }
        System.out.println(result);

        */

        System.out.println("=================================");


        String[] words = {"c","c","A","A","B","C"};
        String str ="";//B C

        for (String each : words) {
            int count=0;
            for (String each1 : words) {
                if(each.equals(each1)){
                    count++;
                }
            }
                if(count==1){
                    str +=each+" ";
            }
        }
        System.out.println(str);




    }
}
/*
Write a program that can display the unique elements of an array

			MUST use for each loops

 */
