package example.codility.yanolja;

public class Task4 {

    private static int solution(int[] A) {

        if(A.length < 0 || A.length > 100000 ){
            return 0;
        }

        int count = 0;

        for (int i = 0; i < A.length; i++)
            for (int j = i+1; j < A.length; j++)
                if (A[i] == A[j]){
                    if((A[i] < -1000000000 || A[i]>1000000000) || (A[j] < -1000000000 || A[j]>1000000000)){
                        return 0;
                    }
                    count++;
                }
        return count;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{6});
    }
}
