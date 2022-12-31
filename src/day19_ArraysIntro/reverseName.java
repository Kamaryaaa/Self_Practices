package day19_ArraysIntro;

public class reverseName {
    public static void main(String[] args) {
        String [] classmates ={"Berna Hashim", "Bursa Turhan", "Tijana Turner","Turgut Karatop",
                "Wumut Wulubieke","Olena Novosad", "Salih Dogrouz","Erik Myrland","Marhaba Dilxat",
                "Abduhupor Abulmit"};

        for (int i = 0; i <=classmates.length-1; i++) {
            String fullName = "";
            String reverseFullName = "";

            fullName=classmates[i];


            for(int j=fullName.length()-1; j>=0; j-- ){
                reverseFullName+= fullName.charAt(j);
            }
            System.out.println(reverseFullName);

        }






    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
