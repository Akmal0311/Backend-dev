package LISTS;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("String");
        list.add(true);
        for(Object o: list){
            System.out.println(o.getClass());
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,2);
        list1.add(1,0);
        list1.add(0,2);
        list1.add(2,1);
        System.out.println(list1.get(0));
        int[] arr = new int[]{1,2,1,2,3,4,4};

        }
}
