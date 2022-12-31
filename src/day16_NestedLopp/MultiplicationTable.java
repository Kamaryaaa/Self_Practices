package day16_NestedLopp;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <11 ; i++) {
            System.out.print("     "+i);

        }

        System.out.println();
        for (int i = 2; i <=20 ; i++) {
            if(i%2==0){
                System.out.print("     "+i);
            }
        }

        System.out.println();
        for (int i = 3; i <=30 ; i++) {
            if(i%3==0){
                System.out.print("     "+i);

            }
        }System.out.println();
        for (int i = 4; i <=40 ; i++) {
            if(i%4==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 5; i <=50 ; i++) {
            if(i%5==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 6; i <=60 ; i++) {
            if(i%6==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 7; i <=70 ; i++) {
            if(i%7==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 8; i <=80 ; i++) {
            if(i%8==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 9; i <=90 ; i++) {
            if(i%9==0){
                System.out.print("     "+i);

            }
        }
        System.out.println();
        for (int i = 10; i <=100 ; i++) {
            if(i%10==0){
                System.out.print("     "+i);

            }
        }




    }
}
/*
Create a class called MultiplicationTable, Write a program that can display the multiplication table:

                        1       2       3       4       5       6       7       8       9       10
                        2       4       6       8       10      12      14      16      18      20
                        3       6       9       12      15      18      21      24      27      30
                        4       8       12      16      20      24      28      32      36      40
                        5       10      15      20      25      30      35      40      45      50
                        6       12      18      24      30      36      42      48      54      60
                        7       14      21      28      35      42      49      56      63      70
                        8       16      24      32      40      48      56      64      72      80
                        9       18      27      36      45      54      63      72      81      90
                        10      20      30      40      50      60      70      80      90      100

 */
