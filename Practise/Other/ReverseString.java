package Practise.Other;

public class ReverseString {
    // Write a Java method called reverseString that takes a string as input and returns the reverse of that string.
    public static void main(String[] args) {
        String message = "Hello World";
        int n = message.length();
        System.out.println(FuncReverseString(n,message));
    }

    public static String FuncReverseString(int n,String message){

        //? Approach 1 
        // char[] string = message.toCharArray();
        // String reversedMessage = "";
        // for(int i=n-1;i>=0;i--){
        //     reversedMessage+=string[i];
        // }
        // return reversedMessage;

        // ! Approach 2
        StringBuilder string = new StringBuilder(message);
        return string.reverse().toString();
    }
}
