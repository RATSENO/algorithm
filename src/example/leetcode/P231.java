package example.leetcode;

public class P231 {
    private static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0 && n>0;

        //2의 거듭제곱인 수는 2진수일 때 1이 하나인 수이다.
        //0001 0000 ---> 16
        //0000 1111 ---> 15
        //&
        //---------
        //0000 0000

        //0000 1111 ---> 15
        //0000 1110 ---> 14
        //&
        //---------
        //0000 0000
    }

    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo(15);
        boolean powerOfTwo1 = isPowerOfTwo(16);
    }
}
