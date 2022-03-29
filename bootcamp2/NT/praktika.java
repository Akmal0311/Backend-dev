package bootcamp2.NT;

import java.util.Random;
import java.util.Scanner;

public class praktika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n;
        System.out.print("n= ");
        n = in.nextInt();
        int a = 1, b = 1 ,c;
        int[] mas = new int[n];
        for (int i=0; i<n; i++){
            c = b+a;
            a = b;
            b = c;
            System.out.println(b);
            mas[i] = b;
        }
        for (int i=0; i<mas.length; i++){
            System.out.print(mas[i]+"  ");
        }
//        int n;
//        System.out.print("n= ");
//        n = in.nextInt();
//        int[] massiv = new int[n];
//        for (int i = 0; i < n; i++ ){
//            massiv[i] = random.nextInt(10);
//            System.out.print(massiv[i]+" ");
//        }
//        System.out.println();
//        for (int i=massiv.length-1; i >= 0; i--){
//            System.out.print(massiv[i]+" ");
//        }

    }
}
