class Pair{
    int x;
    int y;
    Pair(int x,int y){
         this.x=x;
         this.y=y;
    }
}
class Solution {
    public void bfs(char[][] grid,boolean [][] visited,int row,int col ){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col]=true;
        while(q.size()!=0){
            Pair front=q.remove();
            int a=front.x;
            int b=front.y;
            if(b<grid[0].length-1 && grid[a][b+1]=='1' && !visited[a][b+1]){
                q.add(new Pair(a,b+1)); 
                visited[a][b+1]=true;
            } 
            if(a<grid.length-1 && grid[a+1][b]=='1' && !visited[a+1][b]){
                q.add(new Pair(a+1,b)); 
                visited[a+1][b]=true;
            } 
            if(b>0 && grid[a][b-1]=='1' && !visited[a][b-1]){
                q.add(new Pair(a,b-1)); 
                visited[a][b-1]=true;
            } 
            if(a>0 && grid[a-1][b]=='1' && !visited[a-1][b]){
                q.add(new Pair(a-1,b)); 
                visited[a-1][b]=true;
            } 
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
                    bfs(grid,visited,i,j);
                    count++;
                }   
            }
        }
        return count;
    }
}