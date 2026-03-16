package in.kb.geeksForGeeks.missinginArray;

import java.util.Arrays;

public class MissingArray {

    public int missinArray(int[] arry){

        Arrays.sort(arry);

  int n = arry[arry.length - 1];

      int sum1 = 0;
      for (int i = 0; i < arry.length; i++){
            sum1 += arry[i];
      }

      int sum2 = n * (n+1)/2;

      int diff = sum2 -sum1;

      if(diff == 0){
          return arry[arry.length-1] +1;
      }


        return diff;
    };

    public static void main(String[] args) {
        MissingArray obj = new MissingArray();


        int[] arry = {1};
        int  n =obj.missinArray(arry);

        System.out.println(n);

    }




}
