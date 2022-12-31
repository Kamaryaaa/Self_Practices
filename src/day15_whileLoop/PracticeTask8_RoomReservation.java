package day15_whileLoop;

import java.util.Scanner;

public class PracticeTask8_RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to reserve a room");
        String answer = input.next().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid Answer");
            System.out.println("Would you like to reserve a room");
            answer=input.next();
        }
            if(answer.equals("no")){
                System.out.println("have a nice day");
                return;

            }

            input.nextLine();
        System.out.println("Which type of the room do you want?");
        String roomType = input.nextLine().toLowerCase();
        int roomPrice=0;

            if(answer.equals("yes")){
                if(roomType.equals("king bed")){
                    roomPrice=120;
                }
                if(roomType.equals("queen bed")){
                    roomPrice=100;
                }
                if(roomType.equals("single bed")){
                    roomPrice=80;
                }
            }
                while (!((roomType.equals("king bed"))|| (roomType.equals("queen bed"))|| (roomType.equals("single bed")))){
                    System.err.println("Invalid selection, please re-select the room type");
                    roomType=input.nextLine();
                    if(roomType.equals("king bed")){
                        roomPrice=120;
                    }
                    if(roomType.equals("queen bed")){
                        roomPrice=100;
                    }
                    if(roomType.equals("single bed")){
                        roomPrice=80;
                    }
                }

        System.out.println("Your total price is: "+roomType+" ==> "+roomPrice+"$");

        input.close();









    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation,
your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to
    			reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total
            price of the room.

            (if the user selected an invalid room, ask the user to reselect the room
            until user provides a valid entry)

 */
