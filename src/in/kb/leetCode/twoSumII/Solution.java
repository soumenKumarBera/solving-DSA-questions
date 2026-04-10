package in.kb.leetCode.twoSumII;

import in.kb.createArray.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int[] twoSum(int[] arr, int target){


        int i = 0;
        int j = arr.length -1;

        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum == target ){
                return new int[]{i+1, j+1};

            } else if (sum > target) {
                j--;

            }else {
                i++;
            }

        }


        return new int[]{-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(ArrayUtil.util(), target)));
    }
}
