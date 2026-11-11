class Solution {
    static int [][]dp;
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        dp[0][0]=grid[0][0];
        return path(grid.length-1,grid[0].length-1,grid);
    }

    public int path(int m,int n,int [][]grid ){
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(dp[m][n]!=Integer.MAX_VALUE) return dp[m][n];
        return dp[m][n]=grid[m][n]+Math.min(path(m-1,n,grid),path(m,n-1,grid));
    }
}