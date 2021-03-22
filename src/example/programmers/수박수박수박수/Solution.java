package example.programmers.수박수박수박수;

public class Solution {
    public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer+="박";
            }
            if(i%2==1){
                answer+="수";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String solution = solution(3);
        String solution1 = solution(4);
    }
}
