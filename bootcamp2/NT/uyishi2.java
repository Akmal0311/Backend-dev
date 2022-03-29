package bootcamp2.NT;

import java.util.Random;
import java.util.Scanner;

public class uyishi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

//        // 1-masala // massivdagi toq sonlarni osish tartibida chiqaradigan progarmma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int toq = 0;
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++){
//            if (sonlar[i]%2!=0){
//                System.out.print(sonlar[i]+" ");
//                toq++;
//            }
//        }
//        System.out.println("  toqlar soni: "+toq+" ta");
//        // 2-masala // massivni avval juft indexlari keyin toq indexlarini if elsesiz chiqaradigan programma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < n; i+=2){
//            System.out.print(sonlar[i]+" ");
//        }
//        System.out.println();
//        for (int i = 1; i < n; i+=2){
//            System.out.print(sonlar[i]+" ");
//        }
//        // 3-masala // massaivning toq indexlaridagi maxni chiqaradigan programma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        int max = 0;
//        for (int i = 1; i < n; i+=2){
//            for (int j = 1; j < i; j+=2){
//                if (sonlar[j]>=sonlar[i]){
//                    max = sonlar[j];
//                }
//            }
//        }
//        System.out.println("max: "+max);
//        // 4-masala // massivdagi birinchi uchragan lokal minimumni chiqaruvchi programma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        for (int i=0,j=1,k=2; i<n; i++,j++,k++) {
//            if (sonlar[i] > sonlar[j] && sonlar[k] > sonlar[j]){
//                System.out.println("Lokal minimum: "+sonlar[j]); break;
//            }
//        }
//        // 5-masala // massivdagi lokal maxsimumni chiqaradigan programma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        for (int i=0,j=1,k=2; i<n; i++,j++,k++) {
//            if (sonlar[i] < sonlar[j] && sonlar[k] < sonlar[j]){
//                System.out.println("Lokal maxsimum: "+sonlar[j]); break;
//            }
//        }
//        // 6-masala // massivdagi ikta qoshnini yig'indisi eng katta boladiganini ekranga chiqaradigan programma
//        System.out.print("n= ");
//        int n = in.nextInt();
//        int[] sonlar = new int[n];
//        for (int i = 0; i < n; i++){
//            sonlar[i] = random.nextInt(10);
//            System.out.print(sonlar[i]);
//        }
//        System.out.println();
//        int max1=0, max2=0;
//        for (int i=0,j=1; i<n; i++,j++) {
//            for (int k=0,m=1; k<n; k++,m++) {
//                if((sonl var[k] + sonlar[m]) > (sonlar[i] + sonlar[j])){
//                    max1 = sonlar[k];
//                    max2 = sonlar[m];
//                }
//                if (sonlar[m]==sonlar[sonlar.length-1]) --m;
//            }
//            if (sonlar[j]==sonlar[sonlar.length-1]) break;
//        }
//        System.out.println("Output: "+max1+" "+max2);
    }
}
