class Solution {
    public void paths(int n, List<List<Integer>>ans, int source, int destination,boolean [] visited){
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        visited[source]=true;
        while(q.size()!=0){
            int front=q.remove();
            for(int ele:ans.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean [] visited=new boolean[n];
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int a=edges[i][0], b=edges[i][1];
            ans.get(b).add(a);
            ans.get(a).add(b);
        }
        paths(n,ans,source,destination,visited);
        return (visited[destination]);
    }
}