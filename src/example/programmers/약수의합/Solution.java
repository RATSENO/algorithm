package example.programmers.약수의합;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(12);
        int solution1 = solution(5);
    }
}
