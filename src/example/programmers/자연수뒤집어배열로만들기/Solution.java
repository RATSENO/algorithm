package example.programmers.자연수뒤집어배열로만들기;

import java.util.ArrayList;

public class Solution {
    public static int[] solution(long n) {
        String s = String.valueOf(n);
        String[] split = s.split("");

        ArrayList<Integer> integers = new ArrayList<>();
        for(int i=split.length-1; i>=0; i--){
            String tmp = split[i];
            integers.add(Integer.valueOf(tmp));
        }
        return integers.stream().mapToInt(i->i).toArray();
    }

    /*
    이게 훨씬 빠르다.
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0;

        int temp = 0;
        while(n>0) {
            temp = (int) (n%10);
            n = n/10;
            answer[index] = temp;
            index ++;
        }
        return answer;
    }
    */

    public static void main(String[] args) {
        int[] solution = solution(12345);
    }
}
