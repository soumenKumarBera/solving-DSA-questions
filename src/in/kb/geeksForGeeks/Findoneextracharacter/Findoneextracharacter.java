package in.kb.geeksForGeeks.Findoneextracharacter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Findoneextracharacter {

    public static void main(String[] args) {
        String s1 = "efg";
        String s2 = "gfer";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println(b[i]);
                break;
            }

        }
        System.out.println(b[b.length - 1]);

    }
}
