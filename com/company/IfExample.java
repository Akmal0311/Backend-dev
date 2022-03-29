package com.company;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yo'lovchilar soni: ");
        int s = scanner.nextInt();
        for(int i=0 ; i<s ; i++){
            System.out.print((++i)+"-Yo'lovchi yoshi: ");
            i--;
            int a = scanner.nextInt();
            if(a<=7){
                sum+=0;
            }
            else if(a<=18){
                sum+=50;
            }
            else if(a>18){
                sum+=100;
            }
        }
        System.out.println("Umumiy yo'l chipta narxi: "+sum);
    }
}
