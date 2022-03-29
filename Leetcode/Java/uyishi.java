package Leetcode.Java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class uyishi {

    static int SumRow(int[][] A, int M, int N, int K){
        if(K>M) return 0;
        int sum = 0;
        for (int i = K; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += A[i][j];
            }
            return sum;
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int M, N, K;
        System.out.print("M: ");
        M = in.nextInt();
        System.out.print("N: ");
        N = in.nextInt();
        int[][] A = new int[M][N];
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                A[i][j] = random.nextInt(9)+1;
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.print("K: ");
        K = in.nextInt();
        System.out.print("Sum: ");
        System.out.println(SumRow(A, M, N, K));
    }
}
