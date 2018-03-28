package eazy;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/3.
 */
public class HammingDistantce461 {
    public static int hammingDistance(int x, int y) {
        int distance = 0;
        String as = Integer.toBinaryString(x);
        String bs = Integer.toBinaryString(y);
        int al = as.length() - 1;
        int bl = bs.length() - 1;
        char c = '1';
        if (al > bl) {
            for (int i = 0; i <= bl; i++) {
                //如果不相同
                if (as.charAt(al - i) != bs.charAt(bl - i)) {
                    distance = distance + 1;
                }
            }
            for (int i = bl+1; i <= al; i++) {
                if (as.charAt(al - i) == c) {
                    distance = distance + 1;
                }
            }

        } else if (al == bl) {
            for (int i = 0; i <= al; i++) {
                //如果不相同
                if (as.charAt(i) != bs.charAt(i)) {
                    distance = distance + 1;
                }
            }
        } else {
            for (int i = 0; i <= al; i++) {
                //如果不相同
                if (as.charAt(al - i) != bs.charAt(bl - i)) {
                    distance = distance + 1;
                }
            }
            for (int i = al + 1; i <= bl; i++) {
                if (bs.charAt(bl - i) == c) {
                    distance = distance + 1;
                }
            }
        }

        return distance;
    }

}
