package in.kb.leetCode.MergeSortedArray88;

public class Solution {

    public static void merge(int[] nums1,int m, int[] nums2, int n) {

        int l = m + n;
        int i = m - 1;
        int j = n - 1;
        int k = l - 1;


        while (i >= 0 && j >= 0) {

            if (nums2[j] >= nums1[i]) {
                nums1[k--] = nums2[j--];


            } else {
                nums1[k--] = nums1[i--];
            }

        }

        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        ;

        while (j >= 0) {

                nums1[k--] = nums2[j--];


        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);

        for(int vali: nums1){
            System.out.print(vali + " " );
        }
    }
}
