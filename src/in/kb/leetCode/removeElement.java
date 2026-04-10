package in.kb.leetCode;

import in.kb.createArray.ArrayUtil;

public class removeElement {

    public static int solution(int[] arr, int val){
        int k= 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != val){
                k++;


            }
        }

        return  k;
    }

    public static void main(String[] args) {
        System.out.println(solution(ArrayUtil.util(), 3));
    }
}
