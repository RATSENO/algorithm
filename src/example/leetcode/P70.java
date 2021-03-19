package example.leetcode;

public class P70 {
    public int climbStairs(int n) {
        /*
        n=0
        ------------->0
        n=1
        1
        ------------->1
        n=2
        1,1
        2
        ------------->2
        n=3
        1,1,1
        1,2
        2,1
        ------------->3
        n=4
        1,1,1,1
        1,1,2
        1,2,1
        2,1,1
        2,2
        -------------->5
        n=5
        1,1,1,1,1
        1,1,1,2
        1,1,2,1
        1,2,1,1
        2,1,1,1
        1,2,2
        2,1,2
        2,2,1
        --------------->8
        피보나치 수열
         */


        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}
