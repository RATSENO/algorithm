package example.leetcode;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("X");
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3, 4, 5}, 5);
    }
}
