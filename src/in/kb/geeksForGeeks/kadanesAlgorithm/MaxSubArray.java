package in.kb.geeksForGeeks.kadanesAlgorithm;

//You are given an integer array arr[]. You need to find the maximum sum of a subarray
// (containing at least one element) in the array arr[].

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {3,5,1,-7,2};
        int n = arr.length;
//        int max = 0;
//        for(int st = 0; st < n; st++){
//
//            for (int end = st; end < n; end++) {
//                int cur = 0;
//                for (int i = st; i <=end ; i++) {
//                    System.out.print(arr[i]);
//                    cur += arr[i];
//                }
//                System.out.print(" ");
//                if(cur > max){
//                    max = cur;
//                }
//            }
//
//            System.out.println();
//        }
//
//        System.out.println(max);


        //..................................optimatiion code 2..................................

        int max = arr[0];
        int cur = 0;
        for (int i = 0; i < n ; i++) {
            cur += arr[i];
            if (cur > max){
                max = cur;
            }
            if(cur < 0){
                cur = 0;
            }


        }

    }



}
