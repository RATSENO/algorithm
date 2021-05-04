package example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P219 {
    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i <  nums.length; i++) {
            Integer ord = map.put(nums[i], i);
            if(ord != null && i - ord <= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        boolean b1 = containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
    }

}
