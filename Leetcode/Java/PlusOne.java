package Leetcode.Java;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }
        int a = Integer.parseInt(s)+1, k=0;
        int [] numbers = new int[digits.length];
        while (a!=0){
            int c = a%10;
            numbers[k++] = c;
            a = a/10;
        }
        k=0;
        int[] result = new int[digits.length + 1];
        for (int i = numbers.length-1; i >= 0; i--) {
            result[k++] = numbers[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        return digits;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        arr = plusOne(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
