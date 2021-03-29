package example.leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class P169 {
    private static int majorityElement(int[] nums) {
        int result = 0;
        int len = nums.length/2;

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for(int i : nums){
            if(integerIntegerHashMap.get(i)==null){
                integerIntegerHashMap.put(i, 1);
            }else{
                integerIntegerHashMap.put(i, integerIntegerHashMap.get(i)+1);
            }
        }

        Iterator<Integer> iterator = integerIntegerHashMap.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(integerIntegerHashMap.get(next)>len){
                result = next;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = majorityElement(new int[]{3, 2, 3,});
    }
}
