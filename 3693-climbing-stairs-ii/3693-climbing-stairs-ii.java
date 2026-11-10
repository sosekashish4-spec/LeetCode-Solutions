
 

class Solution {
    int[] dp;

    public int climbStairs(int n, int[] costs) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return totalCost(n, costs);
    }

    public int totalCost(int i, int[] costs) {

        // Base case
        if (i == 0) return 0;

        // Memoization
        if (dp[i] != -1) return dp[i];

        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;

        if (i >= 1)
            one = totalCost(i - 1, costs) + costs[i - 1] + 1;

        if (i >= 2)
            two = totalCost(i - 2, costs) + costs[i - 1] + 4;

        if (i >= 3)
            three = totalCost(i - 3, costs) + costs[i - 1] + 9;

        return dp[i] = Math.min(one, Math.min(two, three));
    }
}
