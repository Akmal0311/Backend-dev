package bootcamp3.NT;

import java.util.Random;
import java.util.Scanner;

public class uyishi3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        // 1-masala //
        int n;
        System.out.print("n= ");
        n = in.nextInt();
        int [] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = random.nextInt(10);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int k = 0;
        for (int i = 0 ; i < n ; i+=2){
            b[k] = a[i];
            k+=2;
        }
        k = 1;
        for (int i = 1; i < n; i+=2 ){
            b[k] = a[i];
            k+=2;
        }
        for (int r: b) {
            System.out.print(r+" ");
        }
    }
}
