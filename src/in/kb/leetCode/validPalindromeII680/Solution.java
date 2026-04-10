package in.kb.leetCode.validPalindromeII680;

public class Solution {

    static boolean palinDrom(int i, int j, String s){
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;

            }
        }
        return true;
    }

    static boolean validPalindrom(String s){
        int i =  0,
             j =  s.length() - 1;
        while (i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(left != right){
                return palinDrom(i +1, j , s) || palinDrom(i, j-1, s);
            }else {
                i++;
                j--;
            }


        }
        return true;

    }

    public static void main(String[] args) {
        String s = "cbbcc";
        System.out.println(validPalindrom(s));
    }
}
