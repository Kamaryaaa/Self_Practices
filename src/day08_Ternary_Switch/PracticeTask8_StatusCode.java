package day08_Ternary_Switch;

public class PracticeTask8_StatusCode {
    public static void main(String[] args) {
        //solution1: using ternary

        int statusCode = 700;
        String codeMeaning="";
     String meaning = (statusCode==200)?"Ok":(statusCode==201)?"Created":(statusCode==202)?"Accepted"
             :(statusCode==301)?"Moved permanently" :(statusCode==303)?"See Other":(statusCode==304)?
             "Not Modified":(statusCode==307)?"Temporary Redirect":(statusCode==400)?"Bad Request"
             :(statusCode==401)?"Unauthorized":(statusCode==403)?"Forbidden":(statusCode==404)?"Not Found"
             :(statusCode==410)?"Gone":(statusCode==500)?"Internal server Error":(statusCode==503)?
             "Service Unavailable":"Invalid Code";

        System.out.println(meaning);

        // Second solution: using switch

        switch (statusCode){
            case 200:
                codeMeaning="Ok";
                break;
            case 201:
                codeMeaning="Created";
                break;
            case 202:
                codeMeaning="Accepted";
                break;
            case 301:
                codeMeaning="Moved Permanently";
                break;
            case 303:
                codeMeaning="See Other";
                break;
            case 307:
                codeMeaning="Temporary Redirect";
                break;
            case 400:
                codeMeaning="Bad Request";
                break;
            case 401:
                codeMeaning="Unauthorized";
                break;
            case 403:
                codeMeaning="Forbidden";
                break;
            case 404:
                codeMeaning="Not Found";
                break;
            case 410:
                codeMeaning="Gone";
                break;
            case 500:
                codeMeaning="Internal Server Error";
                break;
            case 503:
                codeMeaning="Service Unavailable";
                break;
            default:
                codeMeaning="Invalid code";
        }
        System.out.println(codeMeaning);






    }
}
/*
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.
 Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement


 */