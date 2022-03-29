package Sortings;

public class insertionSort implements sortInterface {
    public void sort(int[] arr){
        for(int i=1; i < arr.length; i++){
            int a = arr[i];
            for(int j=i-1; j >=0; j--){
                if(a < arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=a; break;
                }
                if(j==0) arr[0]=a;
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public int max(int[] arr){
        int a = arr[0];
        for(int i=1; i < arr.length; i++){
            if(a < arr[i]){
                a = arr[i];
            }
        }
        return a;
    }

}
