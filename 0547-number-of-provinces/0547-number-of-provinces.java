class Solution {
    public void dfs(int n,boolean []visited,int[][] isConnected){
         visited[n]=true;
         for(int j=0;j<isConnected[0].length;j++){ 
            if(isConnected[n][j]==1 && visited[j]==false){
                visited[j]=true;
                dfs(j,visited,isConnected);
            }
         }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean []visited=new boolean [n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
}