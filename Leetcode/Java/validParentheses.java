package Leetcode.Java;

import java.util.ArrayList;
import java.util.LinkedList;

public class validParentheses {
    public static boolean isValid(String s) {
        if(s.length()%2==1 || s.length()==1 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        int[] result = new int[s.length()];
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') result[k++] = 1;       // 1 = ( || 2 = { || 3 = [
            else if(s.charAt(i)=='{') result[k++] = 2;
            else if(s.charAt(i)=='[') result[k++] = 3;
            else if(s.charAt(i)==')' && result[k-1]!='('){
                return false ;
            }
            else if(s.charAt(i)=='}') ;
            else if(s.charAt(i)==']') result[k++] = 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
    }
}
