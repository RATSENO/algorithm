package example.codility;

public class Solution2 {

    static boolean solution(int A[], int K){
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1|| A[n - 1] != K)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {

        boolean solution = solution(new int[]{1,2,2,2,3}, 3);
    }
}
