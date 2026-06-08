class Solution {
    public int countNegatives(int[][] grid) { 
        int i=grid.length-1;
        int j=0;
        int target=0;
        int count =0;
        int n=grid[0].length;
        while(i>=0 && j<n){
            if(grid[i][j]>=target)  j++;
            else{
                    count+=(n-j);
                    i--;
            }    
        }
        return count;
    }
}