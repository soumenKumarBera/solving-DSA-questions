package in.kb.leetCode.startTwoColors;

import in.kb.createArray.ArrayUtil;

public class Solution {

    static void color(int[] nums){
        int i = 0;
        int j = nums.length -1;

        while (i < j){

            if(nums[i] == 0){
                i++;
                continue;
            }
            if (nums[j] == 1){
                j--;
            }else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
    int[] arr = ArrayUtil.util();

    color(arr);

    for (int val: arr){
        System.out.print(val + " ");
    }
    }


}
