package example.programmers.두정수사이의합;

public class Solution {
    public static long solution(int a, int b) {
        long answer = 0;
        long total = 0;
        if(a>b){
            int tmp = 0;
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int start = a; start<=b; start++){
            total += start;
        }
        return total;
    }

    public static void main(String[] args) {
        long solution = solution(5, 3);
    }
}
