class Solution {
    static int[]dp;
    public int climbStairs(int n) { 
        dp=new int[n+1];
        return res(n);

    }
    public int res(int n){
        if(n==1||n==2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=res(n-1)+res(n-2);
    }
}