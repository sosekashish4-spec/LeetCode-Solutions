class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        dp[0]=nums[0];
        if(n==1) return dp[0];
        dp[1]=nums[1];
        for(int k=2;k<n;k++) dp[k]=Integer.MIN_VALUE;
        for(int i=2;i<n;i++){
            for(int j=0;j<i-1;j++){
                dp[i]=Math.max(dp[j],dp[i]);
            }
            dp[i]+=nums[i];
        }
        return Math.max(dp[n-2],dp[n-1]);
    }
}