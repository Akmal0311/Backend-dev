package com.company;

import java.util.Scanner;

public class bootcamp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yil;
        System.out.print("Yilni kiriting: ");
        yil = in.nextInt();
        int a = yil/100;
        if (yil%100==0){
            if (a%4==0){
                System.out.print("Kabisa yili! va 366 kun bor");
            }
            else System.out.print("Kabisa yili emas! va 365 kun bor");
        }
        else {
            if (yil % 4 == 0) {
                System.out.print("Kabisa yili! va 366 kun bor");
            } else System.out.print("Kabisa yili emas! va 365 kun bor");
        }

    }
}
