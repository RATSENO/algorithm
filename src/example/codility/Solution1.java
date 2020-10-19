package example.codility;

public class Solution1 {

    static int solution(int N){
        int res = 0;

        if(N<1){
            return res;
        }

        if(N>50000){
            return res;
        }

        int NSum = 0;
        String[] sArr = Integer.toString(N).split("");

        if(sArr.length==1){
            return res;
        }
        for (String s : sArr) {
            NSum += Integer.parseInt(s);
        }

        int TSum = 0;
        while (true){
            N += 1;
            sArr = Integer.toString(N).split("");
            for (String s : sArr) {
                TSum += Integer.parseInt(s);
            }

            if(TSum == NSum){
                res = N;
                break;
            }else{
                TSum = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int solution = solution(1000);
    }
}
