// class Pair{
//     int x;
//     int y;
//     Pair(int x,int y){
//          this.x=x;
//          this.y=y;
//     }
// }
class Solution {
    public void dfs(char[][] grid,boolean [][] visited,int a,int b ){
        visited[a][b]=true;
            if(b<grid[0].length-1 && grid[a][b+1]=='1' && !visited[a][b+1]){ 
                visited[a][b+1]=true;
                dfs(grid,visited,a,b+1);
            } 
            if(a<grid.length-1 && grid[a+1][b]=='1' && !visited[a+1][b]){
                visited[a+1][b]=true;
                dfs(grid,visited,a+1,b);
            } 
            if(b>0 && grid[a][b-1]=='1' && !visited[a][b-1]){
                visited[a][b-1]=true;
                dfs(grid,visited,a,b-1);
            } 
            if(a>0 && grid[a-1][b]=='1' && !visited[a-1][b]){
                visited[a-1][b]=true;
                dfs(grid,visited,a-1,b);
            } 
        }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1' ){ 
                    dfs(grid,visited,i,j);
                    count++;
                }   
            }
        }
        return count;
    }
}