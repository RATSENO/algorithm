package example.leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while(low<high) {
            int mid=low+(high-low)/2; // low<=mid, mid<high
            if (nums[mid]>=target) high=mid; // high always decreases (even high-low==1)
            else low=mid+1; // low always increases
        }
        return low;
    }

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 4, 5, 6}, 2);
        System.out.println(i);
    }
}
