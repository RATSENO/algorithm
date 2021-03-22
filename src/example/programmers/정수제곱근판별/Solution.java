package example.programmers.정수제곱근판별;

public class Solution {
    public static long solution(long n) {
        long answer = -1;
        double doubleSqrt = Math.sqrt(n);
        int intSqrt = (int)doubleSqrt;
        return intSqrt == doubleSqrt ? (long)Math.pow(intSqrt+1,2) : -1;
    }

    public static void main(String[] args) {
        solution(3);
    }
}
