package day06_ifStatements;

public class PracticeTask5_CharacterIdentity {
    public static void main(String[] args) {
       char ch ='9';
       String result="";
       if(ch>=0 && ch<=47||ch >=58&&ch<=64||ch>=91&&ch<=96||ch<=123&&ch<=127){
           result="Special Character";
       }
       if(ch>=48 && ch<=57){
           result="digit";
       }
       if(ch>=65 &&ch<=90||ch>=97&&ch<=122){
           result="Alphabetic Character";
       }
        System.out.println(result);



    }
}

/*
Create a class named CharacterIdentity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z or a~Z)
or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */