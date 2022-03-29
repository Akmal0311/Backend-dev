package Sortings;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        insertionSort insort = new insertionSort();
        int[] arr = new int[10];
        for(int i=0; i < 10; i++){
            arr[i] = random.nextInt(50)+1;
        }
        for (int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
        insort.sort(arr);
        System.out.println();
        System.out.println(insort.max(arr));
    }
}
