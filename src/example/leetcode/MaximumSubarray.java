package example.leetcode;

import java.util.Arrays;

public class MaximumSubarray {

    private static int solution(int[] nums){
        int best_sum = Integer.MIN_VALUE;
        int end_sum = 0;

        for (int num : nums) {
            end_sum = Math.max(end_sum + num, num);
            best_sum  = Math.max(end_sum, best_sum);
        }
        return best_sum;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
