class Solution {
    public void bfs(int n,boolean []visited,int[][] isConnected){
        Queue<Integer>q=new LinkedList<>();
        q.add(n);
        visited[n]=true;
        while(q.size()!=0){
            int top=q.remove();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[top][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            } 
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean []visited=new boolean [n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
}