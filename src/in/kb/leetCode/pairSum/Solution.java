package in.kb.leetCode.pairSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;

        int count = 0;

        while(i < j){
            int sum = nums.get(i) + nums.get(j);

            if(sum < target){
                count =  count + (j-i);
                i++;
            }else{
                j--;
            };


        };
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);

        System.out.println(countPairs(list, -2));
    }
}
