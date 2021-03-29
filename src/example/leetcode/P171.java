package example.leetcode;

public class P171 {
    private static int titleToNumber(String s) {
        //For s = "BCM" the final solution would be (2 x 26 x 26) + (3 x 26) + (13)
        //26진수 느낌으로 생각하자
        
        if (s == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int aa = titleToNumber("AA");
        int z = titleToNumber("Z");
        int ac = titleToNumber("AC");
    }
}
