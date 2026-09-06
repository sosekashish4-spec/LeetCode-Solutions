class Solution {
    static boolean ans;
    public void bfs(int start,int[][]graph,int[] color){
        Queue<Integer>q=new LinkedList<>();
         q.add(start);
         color[start]=0;
        while(q.size()!=0){
            int front=q.remove();
            int clr=color[front];
            for(int ele:graph[front]){
                if(color[ele]==-1){
                    q.add(ele);
                     color[ele]=1-clr;
                }
                if(color[ele]==color[front]){
                    ans=false;
                    return;
                } 
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        ans=true;
        int m=graph.length;
        int color[]=new int[m];
        Arrays.fill(color,-1);
        for(int i=0;i<m;i++){
            if(color[i]==-1) bfs(i,graph,color);
        }
        return ans;
    }
}