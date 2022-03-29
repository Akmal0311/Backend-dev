package bootcamp3.NT;

import java.util.Random;
import java.util.Scanner;

public class massivlar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n,m,k=0;
        System.out.print("n= ");
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(arr[i]==arr[j]) System.out.print(arr[i][j]+"  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < arr.length ; j++){
                if(j>=i){
                    System.out.print(arr[i][j]+"  ");
                    k+= arr[i][j];
                }else System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("\nsum= "+k);

    }
}
