package in.kb.geeksForGeeks.NextPrimeNumber;

//Given an integer n. Write a program to find the first prime number greater than n.

//Input: n = 15
//Output: 17
//Explanation: 17 is next prime number.


public class NextPrimeNumber {

    public int nextPrime(int next){

        int n =  next + 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                n++;
                i = 1;

            }



        }

      return n;
    };

}
