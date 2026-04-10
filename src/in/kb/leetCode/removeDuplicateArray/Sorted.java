package in.kb.leetCode.removeDuplicateArray;

import in.kb.createArray.ArrayUtil;

public class Sorted {

    public static int removeDuplicates(int[] nums) {
        int k =0;
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[k] != nums[i]){
                k = k + 1;
                j++;
                nums[k] = nums[i];


            }
        }
        return j;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(ArrayUtil.util()));

    }

}
