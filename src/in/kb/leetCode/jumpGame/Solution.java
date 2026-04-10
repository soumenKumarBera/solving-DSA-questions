package in.kb.leetCode.jumpGame;

import in.kb.createArray.ArrayUtil;

public class Solution {

    public  static boolean jump(int[] nums){

        int rechebal = 0;

        for(int i = 0; i < nums.length && i <= rechebal; i++){

            rechebal = Math.max(rechebal, i + nums[i]);

            if (nums[rechebal] == nums[nums.length - 1]) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(jump(ArrayUtil.util()));
    }
}
