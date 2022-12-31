package day22_arrayList;

public class UpperLower {
    public static void main(String[] args) {
       String str = "JAVA java CCCC";

        System.out.println(UpperLower.upperLower(str));



    }





    public static boolean upperLower(String str){

        char[] ch = str.toCharArray();
        int countUpper=0;
        int countLower=0;

        for (char each : ch) {
            boolean isUpperCase = Character.isUpperCase(each);
            if(isUpperCase){
                countUpper++;
            }
            boolean isLowerCase = Character.isLowerCase(each);
            if(isLowerCase){
                countLower++;
            }
        }
        if(countUpper==countLower){
            return true;
        }
        return false;





    }



}
/*

6. Write program that returns true if the total number of upper case characters are equal
to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */
