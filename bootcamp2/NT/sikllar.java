package bootcamp2.NT;

import java.util.Scanner;

public class sikllar {
    public static String countAndSay(String s){
        String result = "";
        char temp = s.charAt(0);
        int count = 1;
        for (int i=1 ; i<s.length(); i++){
            if (s.charAt(i)==temp){
                count++;
            }
            else {
                temp = s.charAt(i);
                result+= count + String.valueOf(s.charAt(i-1));
                count = 1;
            }
        }
        result += count + String.valueOf(s.charAt(s.length()-1));
        return result;
    }
    public static void main(String[] args) {
        String s = "1";
        Scanner in = new Scanner(System.in);
        System.out.print("n= ");
        int n = in.nextInt(), a = 1;
        if (n==1) System.out.println("1");
        for (int i = 1; i < n; i++) {
            s = countAndSay(s);
            System.out.print(s);
        }


    }
}
