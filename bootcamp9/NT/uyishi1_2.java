package bootcamp9.NT;

import java.util.Random;
import java.util.Scanner;

public class uyishi1_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int m,n;
        System.out.print("m: ");
        m = in.nextInt();
        System.out.print("n: ");
        n = in.nextInt();
        int[][] matritsa = new int[m][n];
        for(int i=0; i < m; i++){
            for(int j=0; j<n; j++){
                matritsa[i][j] = random.nextInt(10);
                System.out.print(matritsa[i][j]+"  ");
                matritsa[i][j]=10*i;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matritsa[i][j] + "   ");
            }
            System.out.println();
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int l,y;
        System.out.print("l: ");
        l = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();
        int[][] matrix = new int[l][y];
        for(int i=0; i < l; i++){
            for(int j=0; j<y; j++){
                matritsa[i][j] = random.nextInt(10);
                System.out.print(matritsa[i][j]+"  ");
                matritsa[i][j]=5*j;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < l; i++){
            for(int j=0; j<y; j++){
                System.out.print(matritsa[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
