package example.leetcode;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow","flight"};
        String res = longestCommonPrefix(strs);
    }
}
