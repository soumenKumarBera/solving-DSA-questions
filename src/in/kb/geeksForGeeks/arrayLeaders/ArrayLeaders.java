package in.kb.geeksForGeeks.arrayLeaders;
import in.kb.createArray.ArrayUtil;
import in.kb.geeksForGeeks.revarseArray.RevarceArray;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static ArrayList<Integer> leaders(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;

        for (int i = arr.length - 1; i >= 0 ; i--) {

            if(arr[i] >= max){
                list.add(arr[i]);
                max = arr[i];
            }

        }
        Collections.reverse(list);

        return list;

    }

    public static void main(String[] args) {
        System.out.println(leaders(ArrayUtil.util()));
    }
}
