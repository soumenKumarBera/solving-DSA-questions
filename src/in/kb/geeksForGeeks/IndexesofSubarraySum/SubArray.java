package in.kb.geeksForGeeks.IndexesofSubarraySum;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {

    static ArrayList<Integer> subArraySum(int[] arr, int target){
        int start = 0;
        int end = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++  ){
            sum += arr[i];
             if(sum > target){
                 end = i;
                 while (sum > target){
                     sum -= arr[start];
                     ++start;

                 }
             }

             if(sum == target){
                 ArrayList<Integer> result = new ArrayList<>();

                 result.add(start + 1);
                 result.add(i + 1);

                 return result;
             }


        }


        return  new ArrayList<>(Arrays.asList(-1));
    }
}
