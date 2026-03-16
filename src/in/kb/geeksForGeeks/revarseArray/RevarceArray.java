package in.kb.geeksForGeeks.revarseArray;

import java.util.Arrays;

public class RevarceArray {

    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 2, 1,};


        int n = arr.length;
        int temp = 0;
        int start = 0;
        int end = n - 1;


        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        for(int ar: arr){
            System.out.print(ar +" ");
        }

    }
};
