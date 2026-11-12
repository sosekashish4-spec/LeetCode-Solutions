class Solution {
    static int[] dp;
    public int tribonacci(int n) {
        dp=new int[n+1];
        dp[0]=0;
        if(n==0) return dp[n];
        dp[1]=1;
        if(n==1) return dp[n];
        dp[2]=1;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}