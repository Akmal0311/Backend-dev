package TubSonlar;

import java.util.Scanner;

public class tubson {
    public static String Tubson(int tub){
        if(tub<2) {
            return "tub son emas!";
        }
        for(int i=2; i < Math.sqrt(tub); i++){
            if(tub % i == 0){
                return "tub son emas!";
            }
        }
        return "tub son!";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int tub = in.nextInt();
        System.out.println(Tubson(tub));
    }
}
