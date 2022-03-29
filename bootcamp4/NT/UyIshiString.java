package bootcamp4.NT;

import java.util.Locale;
import java.util.Scanner;

public class UyIshiString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       // 1-masala
//        System.out.print("Satr kiriting: ");
//        String a;
//        a = in.next();
//        int k=0;
//        for(int i=0; i<a.length(); i++){
//            if(a.charAt(i)==';' || a.charAt(i)=='?' || a.charAt(i)==':' || a.charAt(i)=='"' || a.charAt(i)=='\'' || a.charAt(i)=='!' || a.charAt(i)=='.' || a.charAt(i)=='(' || a.charAt(i)==')'){
//                k++;
//            }
//        }
//        System.out.print("Tinish belgilar soni: "+k+" ta" );

        // 2-masala
//        System.out.print("Satr kiriting: ");
//        String b;
//        int k=0;
//        b = in.nextLine();
//        for (int i=0; i<b.length(); i++){
//            if(b.charAt(i)>=65 && b.charAt(i)<=90){
//                k++;
//            }
//        }
//        System.out.println("Katta harflar soni: "+k+"ta");

//        String a = Integer.toBinaryString(5);
//        String result = "";
//        for (int i = 0; i < a.length(); i++) {
//            if(a.charAt(i)==1){
//                result += '0';
//            }else{
//                result += '1';
//            }
//        }
//        int f = Integer.parseInt(result, 2);
//        System.out.println(f);

        // 3-masala
        String s = "Hello World Kim bor bu dunyoda";
        for (int i = 0; i <s.length() ; i++) {
            s.split(" ");
            System.out.println(s);
        }
    }
}
