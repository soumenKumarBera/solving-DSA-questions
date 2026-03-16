package in.kb.geeksForGeeks.arrayAvarage;

//You are given an array arr[] that contains integers.
// You need to return average of the non negative integers in double format.

public class ArrayAvarage {


    public static void main(String[] args) {
        int[] arr = {34, -4, 67,-8 , -8};
        double sum = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0 ){
                j++;

                sum += arr[i];

            }

        }
        double avarage=  sum / j ;

        System.out.println(avarage);

    }
}
