package in.kb.leetCode.sortColor75;

import in.kb.createArray.ArrayUtil;

public class solution {
    static void sortColor(int[] nums){
        int i = 0;
        int k= 0;
        int j = nums.length - 1;
        int temp;
        while(k <= j){

            if (nums[k] == 1 ){
                k++;
            } else if (nums[k] == 2) {
                temp = nums[k];
                nums[k] = nums[j];
                nums[j] =temp;
                j--;


            }else {
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtil.util();
        sortColor(arr);
        for(int val: arr){
            System.out.print(val + " ");
        }

    }
}
