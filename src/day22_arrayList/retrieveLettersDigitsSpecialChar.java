package day22_arrayList;

public class retrieveLettersDigitsSpecialChar {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        retrieveLettersDigitsSpecialChar.retrieve(str);



    }

    public static void retrieve(String str){
        String letters="";
        String digits="";
        String special="";
        char [] ch=str.toCharArray();

        for (char each : ch) {
            boolean isLetter =Character.isLetter(each);
            if(isLetter){
                letters +=each;
            }
            boolean isDigit=Character.isDigit(each);
            if(isDigit){
                digits+= each;
            }
            boolean isSpecial=Character.isLetterOrDigit(each);
            if(!isSpecial==true){
                special+=each;
            }
        }
        System.out.println("letters = \""+letters+"\" \n"+"digits = \""+digits+"\" \n"+"specialChars = \""
        +special+"\"");








    }




}

/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */
