package example.leetcode;

public class P191 {

    // you need to treat n as an unsigned value
    private static int hammingWeight(int n) {
        int cnt = 0;
        while(n!=0) {
            //비트연산자 계산해서 1이 나오면 (n하나씩 씨프트 해서 계산했을 때)1인지 확인 가능
            cnt = cnt + (n & 0b00000000000000000000000000000001);
            n = n>>>1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int i = hammingWeight(0b00000000000000000000000000001011);
    }
}
