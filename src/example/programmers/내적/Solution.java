package example.programmers.내적;

public class Solution {
    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2});
    }
}
