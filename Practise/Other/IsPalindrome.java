package Practise.Other;

public class IsPalindrome {
    // Write a Java method called isPalindrome that takes a string as input and returns true if the string is a palindrome,
    // and false otherwise. A palindrome is a word, phrase, number,
    // or other sequence of characters that reads the same forward and backward, disregarding spaces, punctuation,
    // and capitalization.

    public static void main(String[] args){
        String message = "Able was I saw Elba";
        System.out.println(checkIsPalindrome(message));
    }

    public static Boolean checkIsPalindrome(String message){
        // General approach by using String Builder
        
        // int n = message.length();
        // if(n<1)return false;
        // if(n==1)return true;
        // StringBuilder string = new StringBuilder(message);
        // String reversedMessage = string.reverse().toString();
        // if(message.equalsIgnoreCase(reversedMessage)){
        //     return true;
        // }
        // return false;

        // ! Two pointer appraoch
        int left = 0;
        int right = message.length()-1;
            
        char leftChar = Character.toLowerCase(message.charAt(left));
        char rightChar = Character.toLowerCase(message.charAt(right));

        if (!Character.isLetterOrDigit(leftChar)) {
            left++;
        }else if(!Character.isLetterOrDigit(rightChar)){
            right--;
        }else{
            if(leftChar != rightChar){
                return false;
            }
        }return true;

    }
}
