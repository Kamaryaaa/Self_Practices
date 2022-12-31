package day19_ArraysIntro;

import java.util.Arrays;

public class Classmate {
    public static void main(String[] args) {

     String [] classmates ={"Berna Hashim", "Bursa Turhan", "Tijana Turner","Turgut Karatop",
        "Wumut Wulubieke","Olena Novosad", "Salih Dogrouz","Erik Myrland","Marhaba Dilxat",
        "Abduhupor Abulmit"};
        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0)+ "."+classmates[i].charAt(classmates[i].indexOf(" ")+1));
        }











    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */
