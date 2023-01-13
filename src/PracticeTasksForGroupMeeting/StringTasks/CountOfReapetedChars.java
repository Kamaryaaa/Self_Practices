package PracticeTasksForGroupMeeting.StringTasks;

public class CountOfReapetedChars {
    public static void main(String[] args) {

        System.out.println(countChars("aaabbcfffvvv"));

    }




    public static String countChars(String str){
        String result="";// for sorting the result
        int count=0;//for counting thars
        char temp=str.charAt(0);//for comparing it with every char in the string

        for (char each : str.toCharArray()) {
            if(each==temp){// if each equal to temp
                count++;

            }else {// if each not equal to temp
                result +=""+temp+count;//storing the chars and the count into the result
                                       // empty string: for concatenating as a string
                temp=each;
                count=1;
            }

        }
        result +=""+temp+count;
        return result;

    }







}




