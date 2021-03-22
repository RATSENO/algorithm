package example.programmers.소수찾기;

public class Solution {
    public static int solution(int n) {
        //에라토스테네스의 체
        //https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4
        int answer = 0;
        boolean[] checked = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!checked[i])
                answer++;
            for (int j = i; j <= n; j += i) {
                if (!checked[j])
                    checked[j] = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(10);
    }
}
