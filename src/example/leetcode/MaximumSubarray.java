package example.leetcode;

import java.util.Arrays;

public class MaximumSubarray {

    private static int solution(int[] nums){
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for(int i=1;i<nums.length; i++){
            int a = maxEndingHere+nums[i];
            int b = nums[i];
            maxEndingHere = Math.max(a, b);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
