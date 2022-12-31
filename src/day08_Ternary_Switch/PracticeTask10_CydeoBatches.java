package day08_Ternary_Switch;

import java.util.EventListener;

public class PracticeTask10_CydeoBatches {
    public static void main(String[] args) {
        String batchType="US morning";
        String scheduel="Class times are ";

        //solution one: using if statement

       /* if(batchType=="US morning"){
            scheduel=scheduel+"10-5 EST. M,T,TH,F";
        }  else if(batchType=="US evening"){
            scheduel=scheduel+"7-10 EST. M,T,W,TH,S,S";
        } else  if(batchType=="EU") {
            scheduel=scheduel+"10-5 EST. M,T,W,TH,F";
        }else {
            scheduel="Invalid Batch";
        }
        //System.out.println(scheduel);

        */


        //Solution two:using switch statement

       /* switch (batchType){
            case "US morning":
                scheduel=scheduel+"10-5 EST. M,T,TH,F";
                break;
            case "US evening":
                scheduel=scheduel+"7-10 EST. M,T,W,TH,S,S";
                break;
            case "EU":
                scheduel=scheduel+"10-5 EST. M,T,W,TH,F";
                break;
            default:
                scheduel="Invalid Batch";
        }
        System.out.println(scheduel);

        */

        //solution three: using if & swich statements mixed

      /* switch (batchType){
           if(batchType=="US morning"|| batchType=="US Evening"|| batchType=="EU"){
               case "US morning":
                   scheduel=scheduel+"10-5 EST. M,T,TH,F";
               case "US evening":
                   scheduel=scheduel+"7-10 EST. M,T,W,TH,S,S";
               case "EU":
                   scheduel=scheduel+"10-5 EST. M,T,W,TH,F";
               default:
                   scheduel="Invalid Batch";

           }
       }

       */

    }
}
/*
Create a class named CydeoBatches. In Cydeo we have three batch types: US morning,
US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */