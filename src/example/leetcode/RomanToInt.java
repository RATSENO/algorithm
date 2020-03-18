package example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I'://1
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V'://5
                    res += 5;
                    break;
                case 'X'://10
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L'://50
                    res += 50;
                    break;
                case 'C'://100
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D'://500
                    res += 500;
                    break;
                case 'M'://1000
                    res += 1000;
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = romanToInt("IX");
    }
}
