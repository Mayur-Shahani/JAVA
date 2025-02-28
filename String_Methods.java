package ClassProgram;

import java.net.SocketTimeoutException;

public class String_Methods {
    public static void main(String[] args) 
    {
        System.out.println("**** Length Method ****");
        String message = "Hi I am Mayur Shahani";
        int strLength = message.length();
        System.out.println("The length of message is : " +strLength);

        System.out.println("**** LowerCase Method ****");
        String lowerCase = message.toLowerCase();
        System.out.println(lowerCase);

        System.out.println("**** UpperCase Method ****");
        String upperCase = message.toUpperCase();
        System.out.println(upperCase);

        System.out.println("**** Trim Method ****");
        String unTrimmedMessage = "         Mayur       ";
        System.out.println(unTrimmedMessage);
        System.out.println(unTrimmedMessage.trim());

        System.out.println("**** CharAt Method ****");
        char charOfIndex = message.charAt(3);
        System.out.println(charOfIndex);

        System.out.println("**** IndexOf Method ****");
        int indexOfCharacter = message.indexOf('i',3);
        System.out.println(indexOfCharacter);

        System.out.println("**** SubString Methods ****");
        String subStringMessage = message.substring(7, 13);
        System.out.println(subStringMessage);

        System.out.println("**** Replace Method ****");
        String replaceMessage = message.replace('S', 'k');
        System.out.println(replaceMessage);

        System.out.println("**** StartsWith Method ****");
        boolean startsString = message.startsWith("Hi");
        System.out.println(startsString);

        System.out.println("**** EndsWith Method ****");
        boolean endsString = message.endsWith("Shahani");
        System.out.println(endsString);

        System.out.println("**** Equals Method ****");
        String firstName =  "Mayur";
        boolean checkName = firstName.equals("Mayur");
        System.out.println(checkName);

        System.out.println("**** Equals Ignore Case Method ****");
        boolean checkNaame = firstName.equalsIgnoreCase("mayur");
        System.out.println(checkNaame);
    }   
}
