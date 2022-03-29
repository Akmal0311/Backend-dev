package com.company;

import java.util.Scanner;

public class bootcamp2 {
    public static void main(String[] args) {
        int yil;
        Scanner in = new Scanner(System.in);
        yil = in.nextInt();
        if(yil%4==0 && yil%400==0){
            System.out.println("Kabisa yili!");

        }
        else{
            System.out.println("Kabisa yili emas!");
        }
    }
}
