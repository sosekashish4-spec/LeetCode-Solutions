class Solution {
    public void kahn(int start,boolean[] visited,int[] indegree,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>adj){
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
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited=new boolean[numCourses];
        int[] indegree=new int[numCourses];
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            adj.get(b).add(a);
        }

        for(int i=0;i<indegree.length;i++){
            for(int j=0;j<adj.get(i).size();j++){
                indegree[adj.get(i).get(j)]++;
            }
        }

        for(int i=0;i<numCourses;i++){
            if(!visited[i] && indegree[i]==0) kahn(i,visited,indegree,ans,adj);
        }
        return (ans.size()==numCourses);
    }
}