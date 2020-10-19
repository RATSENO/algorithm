package example.leetcode;

public class ReversInteger {
    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;

        //If reverse == Integer.MAX_VALUE/10, then reverse = 2,147,483,640. We know that anything over 2,147,483,647 causes integer overflow, so pop cannot be greater than 7.

        //Likewise, if reverse == Integer.MIN_VALUE/10, then reverse = -2,147,483,640. We know that anything under -2,147,483,648 causes integer underflow, so pop cannot be less than -8
    }

    public static void main(String[] args) {

        System.out.println("Integer max:"+Integer.MAX_VALUE);
        System.out.println("Integer min:"+Integer.MIN_VALUE);

        int reverse = reverse(123);
        int reverse1 = reverse(-123);
        int reverse2 = reverse(120);
        int reverse3 = reverse(0);
        int reverse4 = reverse(-120);
        int reverse5 = reverse(2147483647);
        int reverse7 = reverse(-2147483648);
    }
}
