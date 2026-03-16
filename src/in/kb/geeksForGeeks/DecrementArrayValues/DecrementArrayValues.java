package in.kb.geeksForGeeks.DecrementArrayValues;

import java.util.Arrays;

public class DecrementArrayValues {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,-1};

        int temp = 0;

        for(int i = 0; i < arr.length; i++){

            temp = arr[i] - 1;
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
