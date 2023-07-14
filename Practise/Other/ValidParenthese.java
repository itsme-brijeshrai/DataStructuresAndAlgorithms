package Practise.Other;

public class ValidParenthese {
// Description: Given a string containing only parentheses ('(', ')', '{', '}', '[', ']'),
// determine if the input string is valid. An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// An empty string is also considered valid.
    public static void main(String[] args) {
        String string = "({}})";
        int n = string.length();
        System.out.println(FindValid(string,n));
    }

    public static boolean FindValid(String string, int n){
        int pattern1Count = 0;
        int pattern2Count = 0;
        int pattern3Count = 0;
        int pattern4Count = 0;
        int pattern5Count = 0;
        int pattern6Count = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='('){
                pattern1Count++;
            }else if(string.charAt(i)==')'){
                pattern2Count++;
            }else if(string.charAt(i)=='{'){
                pattern3Count++;
            }else if(string.charAt(i)=='}'){
                pattern4Count++;
            }else if(string.charAt(i)=='['){
                pattern5Count++;
            }else if(string.charAt(i)==']'){
                pattern6Count++;
            }
        }
        if(pattern1Count==pattern2Count && pattern3Count==pattern4Count && pattern5Count==pattern6Count)return true;
        return false;
    }
}
