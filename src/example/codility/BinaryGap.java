package example.codility;

public class BinaryGap {
    public static int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);

        char[] binaryChar = binaryString.toCharArray();
        int totalGapLength = 0;
        int gapLength = 0;

        for(int i=0;i<binaryChar.length;++i){
            if(binaryChar[i] == '1'){
                if(gapLength > totalGapLength) {
                    totalGapLength = gapLength;
                }
                gapLength = 0;
            }else{
                ++gapLength;
            }
        }

        return totalGapLength;
    }

    public static void main(String[] args) {
        int solution = solution(529);
        System.out.println(solution);
    }
}
