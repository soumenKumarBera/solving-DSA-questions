package in.kb.geeksForGeeks.secondLargestElement;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {94,94,94};
        int n = arr.length;


        Arrays.sort(arr);


        for (int i = n-2; i >= 0; i--){

            if( arr[i] != arr[arr.length - 1]){

                System.out.println(arr[i]);
                return;
            }


        }

        System.out.println("-1");
    }


}
