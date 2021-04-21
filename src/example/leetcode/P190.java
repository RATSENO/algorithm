package example.leetcode;

public class P190 {

    private static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = reverseBits(0b11111111111111111111111111111101);
        int i1 = reverseBits(0b00000010100101000001111010011100);
    }
}
