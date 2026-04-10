package in.kb.geeksForGeeks.MinimumJumps;

public class MinimumJumps {

    public static int minJump(int[] arr){
        int n = arr.length - 1;
        int max = 0;
        int chouse = 0;
        int jump = 0;

//        int[] arr = {1 4 3 2 6 7};

        for(int i = 0; i <= n; i++){
            max = arr[i] + i;

            if(i == chouse){
                chouse = max;
                jump++;
            }

        }
        if (chouse >= n){
            return jump;
        }
        return  -1;
    }
}
