package bootcamp5.NT;

public class leetcode2 {
    public int singleNumber(int[] sonlar) {
        int res = sonlar[0];
        for (int i=1; i<sonlar.length; i++){
            res^=sonlar[i];
        }
        return res;
    }
}
