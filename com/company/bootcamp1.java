package com.company;

import java.util.Scanner;

public class bootcamp1 {
    public static void main(String[] args) {
//        int a, b;
//        Scanner in = new Scanner(System.in);
//        System.out.print("a= ");
//        a = in.nextInt();
//        System.out.print("b= ");
//        b = in.nextInt();
//        if(a<0 || b<0){
//            System.out.println((a+b)/2);
//        }
//        else {
//            System.out.println(Math.sqrt(a*b));
//        }
        Scanner in = new Scanner(System.in);
/*
        int a, b ,c;
        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();
        if(a>c && a>b) System.out.println(a+"-eng kattasi");
        else if(b>c) System.out.println(b+"-eng kattasi");
        else System.out.println(c+"-eng kattasi");
*/
        System.out.print("uch xonali son kiriting: ");
        int son = in.nextInt();
        int a = son/100%10;
        switch (a) {
            case 1:
                System.out.print("Bir yuz "); break;
                case 2:
                    System.out.print("Ikki yuz "); break;
                case 3:
                    System.out.print("Uch yuz "); break;
                case 4:
                    System.out.print("To'rt yuz "); break;
                case 5:
                    System.out.print("Besh yuz "); break;
                case 6:
                    System.out.print("Olti yuz "); break;
                case 7:
                    System.out.print("Yetti yuz "); break;
                case 8:
                    System.out.print("Sakkiz yuz ");break;
                case 9:
                    System.out.print("To'qqiz yuz ");break;

        }
        int b = son/10%10;
        switch (b) {
            case 1:
                System.out.print("o'n ");break;
            case 2:
                System.out.print("yigirma ");break;
            case 3:
                System.out.print("o'ttiz ");break;
            case 4:
                System.out.print("qirq ");break;
            case 5:
                System.out.print("ellik ");break;
            case 6:
                System.out.print("oltmush ");break;
            case 7:
                System.out.print("yetmush ");break;
            case 8:
                System.out.print("sakson ");break;
            case 9:
                System.out.print("to'qson ");break;
        }
        int c = son%10;
        switch (c) {
            case 1:
                System.out.print("bir");break;
            case 2:
                System.out.print("ikki");break;
            case 3:
                System.out.print("uch");break;
            case 4:
                System.out.print("to'rt");break;
            case 5:
                System.out.print("besh");break;
            case 6:
                System.out.print("olti");break;
            case 7:
                System.out.print("yetti");break;
            case 8:
                System.out.print("sakkiz");break;
            case 9:
                System.out.print("to'qqiz");break;
        }
    }
}
