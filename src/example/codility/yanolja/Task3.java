package example.codility.yanolja;

public class Task3 {

    private static int solution(String S) {
        int strLength = S.length();
        if(strLength == 0){

        }

        if(S.matches(".*[^0|1].*") ){
            return 0;
        }

        int num = Integer.parseInt(S, 2);

        int cnt = 0;
        while(num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            cnt++;
            continue;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution("");
    }
}
