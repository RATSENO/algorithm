package example.leetcode;

public class P121 {
    private static int maxProfit(int[] prices) {
        int ans=0;
        if(prices.length==0)
        {
            return ans;
        }
        int bought=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>bought)
            {
                if(ans<(prices[i]-bought))
                {
                    ans=prices[i]-bought;
                }
            }
            else
            {
                bought=prices[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
}
