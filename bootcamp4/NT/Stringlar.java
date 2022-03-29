package bootcamp4.NT;

import java.util.Scanner;

public class Stringlar {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        //System.out.println(sortSentence(s));
        String a =  s.substring(0,5);
        System.out.println(a);
    }
    public static String sortSentence(String s) {
        String soz = "";
        String[] sozlar = new String[8];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='1' && s.charAt(i)<='9'){
                String m = "";
                m += s.charAt(i);
                System.out.println(m.getClass());
                int a = Integer.parseInt(m);
                System.out.println(a);
                sozlar[a] = soz;
                soz = "";
            }else if(s.charAt(i)!=' ' || s.charAt(i)>='1' && s.charAt(i)<='9'){
                soz += s.charAt(i);
                //System.out.print(s.charAt(i) + " ");
            }
        }
        soz = "";
        for(int i=0; i<8; i++){
            if(sozlar[i]!=null) soz += sozlar[i];
        }
        return soz;
    }
}
