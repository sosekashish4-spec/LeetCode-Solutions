class Solution {
    public void kahn(int start,boolean[] visited,int[] indegree,List<Integer>ans,List<List<Integer>>adj){
        visited[start]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        while(q.size()!=0){
            int front=q.remove();
            ans.add(front);
            if(adj.get(front).size()!=0){
                for(int ele:adj.get(front)){
                    indegree[ele]--;
                    if(indegree[ele]==0){
                        q.add(ele);
                        visited[ele]=true;
                    }
                }
            }
        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>ans=new ArrayList<>();
        List<List<Integer>>adj=new ArrayList<>();
        int n=graph.length;

        boolean[] visited=new boolean[n];

        int[] indegree=new int[n];
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<n;i++){        //rev adjacency list
             for(int ele:graph[i]){
                int a=ele;
                adj.get(ele).add(i);
                indegree[i]++;
             }
        }
        // for(int i=0;i<n;i++){
        //     for(int ele:adj.get(i)){
        //         indegree[ele]++;
        //     }
        // }

        for(int i=0;i<n;i++){
            if(!visited[i] && indegree[i]==0) kahn(i,visited,indegree,ans,adj);
        }

        Collections.sort(ans);
        return ans;
    }
}