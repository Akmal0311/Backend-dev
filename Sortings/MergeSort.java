package Sortings;

public class MergeSort {
    public static void MergeSort(int[] momo, int n){
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for(int i=0; i < mid; i++){
            l[i] = momo[i];
        }
        for (int i=mid; i < n; i++){
            r[i - mid] = momo[i];
        }
        MergeSort(l, mid);
        MergeSort(r, n - mid);

        Merge(momo, l, r, mid, n-mid);

    }

    public static void Merge(int[] momo, int[] l, int[] r, int left, int right){
        int i=0, j=0, k=0;
        while (i < left && j < right){
            if(l[i]<=r[j]){
                momo[k++] = l[i++];
            }
            else{
                    momo[k++] = r[j++];
            }
        }
        while (i < left){
            momo[k++] = l[i++];
        }
        while (j < right){
            momo[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int[] momo = {4,2,5,1,3};

        MergeSort(momo, momo.length);
        for (int i = 0; i < momo.length; i++) {
            System.out.print(momo[i]);
        }



    }
}
