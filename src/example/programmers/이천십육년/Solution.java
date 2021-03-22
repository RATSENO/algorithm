package example.programmers.이천십육년;

public class Solution {

    private static String solution(int a, int b) {
        int total = 0;
        //문제에서 1월1일은 금요일이기 때문에 배열의 첫번째는 금요일부터 시작한다.
        String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        //각 달의 일수
        int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};

        //주어진 a월까지의 일 수를 더한다.
        for(int i =0;i<a-1;i++){
            total += m[i];
        }

        //-1일 하지 않으면 1월 1일도 하루가 지난것으로 체크됨
        total += b-1;

        //전체 일수를 일주일로 나눈 나머지
        String answer = w[total%7];
        return answer;
    }

    public static void main(String[] args) {

    }
}
