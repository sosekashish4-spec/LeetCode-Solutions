class Solution {
    public void paths(int n, List<List<Integer>>ans, int source, int destination,boolean [] visited){
        visited[source]=true;
        for(int ele:ans.get(source)){
            if(!visited[ele]){
                visited[ele]=true;
                paths(n,ans,ele,destination,visited);
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