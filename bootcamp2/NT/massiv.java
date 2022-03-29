package bootcamp2.NT;

import java.util.Random;
import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
//        int[] array = new int[10];
//        int[] arr2 = {1,2,3};
//        for (int a: arr2){
//            System.out.println(a);
//        }
//        int juft=0, toq=0;
//        for (int i=0; i<arr2.length; i++){
//            array[i] = random.nextInt(10);
//            if (array[i]%2==0) juft++;
//            else toq++;
//        }
//        System.out.println("juft --> "+juft +"| toq--> " +toq);
//        System.out.println(array);
        int [][] array = new int[10][10];
        int n,m;
        System.out.print("n: ");
        n = in.nextInt();
        System.out.print("m: ");
        m = in.nextInt();
        for (int i=0; i<n; i++ ){
            for (int j=0 ; j<m; j++){
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
