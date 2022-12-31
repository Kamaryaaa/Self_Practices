package day08_Ternary_Switch;

public class PracticeTask5_ChooseLanguage {
    public static void main(String[] args) {

        //Solution1

        int selection =1;
        String language=(selection>=1&&selection<=5)? (selection==1)?"Hello,thank you for your call"
                :(selection==2)?"Hola, gracias para llamar" :(selection==3)?
                "Merhaba, aradigniz icin tesekkurler" :(selection==4)?
                "Privet, spasibo za vash zvonok" :"Merci,pour votre appel":"Invalid number";
        System.out.println(language);

        //solution 2

        System.out.println("========================-=-=-================");


        int selection2=3;
        String language2="";

        switch (selection2){
            case 1:
                language2="Hello,thank you for your call";
                break;
            case 2:
                language2="Hola, gracias para llamar";
                break;
            case 3:
                language2="Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                language2="Privet, spasibo za vash zvonok";
                break;
            case 5:
                language2="Merci ,pour votre appel";
                break;
            default:
                language2="Invalid Number Selected";
        }
        System.out.println(language2);




    }
}
/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */