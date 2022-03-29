package bootcamp5.NT;

public class OOP2 {
    public static void main(String[] args) {
        leetcode2 s = new leetcode2();
        int[] a = new int[]{1,2,1};
        int[] b = new int[]{4,1,2,1,2};
        if(s.singleNumber(a) == 2){
            System.out.println("1-test to'g'ri!");
        }else System.out.println("1-test xato!");
        if (s.singleNumber(b) == 4){
            System.out.println("2-test to'g'ri!");
        }else System.out.println("2-test xato!");
    }
}