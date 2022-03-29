package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
//        System.out.println(4+5);
//        System.out.println(7-5);
//        System.out.println(7*5);
//        System.out.println(75/5);
//
//        System.out.println(4 * 5 + 12/3 -2 * 3);
//
//        int i = 6;
//        i++; // i = i+1 ++i
//        System.out.println(++i);
//


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Birinchi sonni kiriting = ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Ikkinchi sonni kiriting = ");
        int b = scanner.nextInt();

        System.out.println(a+b);
        System.out.println((a>b) + " a>b");
        System.out.println((a<b) + " a<b");


    }
}
