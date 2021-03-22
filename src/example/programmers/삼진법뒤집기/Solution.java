package example.programmers.삼진법뒤집기;

public class Solution {

    private static int solution(int n) {
        int answer = 0;

        String samjin = "";
        while (n!=0){
            samjin += n%3;
            n = n/3;
        }

        char[] charArray = samjin.toCharArray();
        for(int i=0; i<charArray.length; i++){
            answer+=(charArray[i]-'0') * (Math.pow(3,charArray.length-i-1));
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(45);
    }
}
