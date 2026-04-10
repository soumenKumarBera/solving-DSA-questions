package in.kb.leetCode.SquaresofaSortedArray;

//Given an integer array nums sorted in non-decreasing order,
//return an array of the squares of each number sorted in non-decreasing order.

//Input: nums = [-4,-1,0,3,10]

import in.kb.createArray.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soulution {

    public static int[] squares(int[] nums){

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]  < 0){
                neg.add(nums[i]);
            }else {
                pos.add(nums[i]);
            }

        };
        //no nagetive value
        if(neg.size() == 0){
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));

            };

            return pos.stream().mapToInt(Integer::intValue).toArray();

        };
        if (pos.size() == 0){
            for (int i = 0; i < neg.size(); i++) {

                neg.set(i, neg.get(i) * neg.get(i));

            };
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        };

        int n = neg.size();
        int p = pos.size();

        for (int i = 0; i < n; i++) {
            neg.set(i, neg.get(i) * neg.get(i));

        }
        Collections.reverse(neg);

        for (int i = 0; i < p; i++) {
            pos.set(i, pos.get(i) * pos.get(i));

        }

        int i = 0;
        int j = 0;
        int[] temp = new int[n + p];
        int k = 0;

        while (i < n && j < p){
            if (neg.get(i) <= pos.get(j)){
                temp[k++] = neg.get(i++);
            }else {
                temp[k++] = pos.get(j++);
            }


        }

        while (i < n){
            temp[k++] = neg.get(i++);

        };

        while (j < p){

            temp[k++] = pos.get(j++);

        };

return temp;




    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squares(ArrayUtil.util())));
    }

}
