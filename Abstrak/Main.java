package Abstrak;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        uzcardBank uzcard = new uzcardBank(100000.00);
        humoBank humo = new humoBank(100000.00);
        Scanner in = new Scanner(System.in);
        System.out.print("1-uzcardBank/ 2-humoBank: ");
        int a = in.nextInt();
        if(a==1){
            System.out.print("1-hisob ko'rish/ 2-hisobdan pul yechish/ 3-hisobga pul solish: ");
            int c = in.nextInt();
            if(c==1){
                System.out.println(uzcard.getUzcardhisob());
            }else if(c==2){
                System.out.print("Summani kiriting: ");
                double b = in.nextDouble();
                System.out.print("hisobingizdan "+b+" yechildi qolgan hisobingiz: "+uzcard.pulyechish(uzcard.getUzcardhisob(),b));
            }else if(c==3){
                System.out.print("Summani kiriting: ");
                double b = in.nextDouble();
                System.out.print("hisobingizga "+b+" summa qoshilgandan keyin, hisobingizdagi summa: "+uzcard.pulsolish(uzcard.getUzcardhisob(),b));
            }
        }else if(a==2){
            System.out.print("1-hisob ko'rish/ 2-hisobdan pul yechish/ 3-hisobga pul solish: ");
            int c = in.nextInt();
            if(c==1){
                System.out.println(humo.getHisob());
            }else if(c==2){
                System.out.print("Summani kiriting: ");
                double b = in.nextDouble();
                System.out.print("hisobingizdan "+b+" yechildi qolgan hisobingiz: "+humo.pulyechish(humo.getHisob(),b));
            }else if(c==3){
                System.out.print("Summani kiriting: ");
                double b = in.nextDouble();
                System.out.print("hisobingizga "+b+" summa qoshilgandan keyin, hisobingizdagi summa: "+ humo.pulsolish(humo.getHisob(),b));
            }
        }
    }
}
