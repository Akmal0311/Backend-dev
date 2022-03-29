package Leetcode.Java;

import java.util.Random;
import java.util.Scanner;

public class uyishi2 {
    static void RemoveCols(int[][] A, int M, int N, int K1, int K2){
        int[][] result = new int[M][N];
        int m = 0, n = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= K1 && j <= K2) {
                }else{
                    result[i][j] = A[i][j];
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= K1 && j <= K2) {
                }else{
                    System.out.print(result[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int M, N, K1, K2;
        System.out.print("M: ");
        M = in.nextInt();
        System.out.print("N: ");
        N = in.nextInt();
        int[][] A = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = random.nextInt(9)+1;
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.print("K1: ");
        K1 = in.nextInt();
        System.out.print("K2: ");
        K2 = in.nextInt();
        RemoveCols(A,M,N,K1,K2);
    }
}
