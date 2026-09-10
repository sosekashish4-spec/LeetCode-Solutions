class Solution {
    static boolean ans;
    public void dfs(int start,boolean[] visited,boolean[] paths,ArrayList<ArrayList<Integer>>adj){
        visited[start]=true;
        paths[start]=true;
        for(int i:adj.get(start)){
            if(paths[i]){
                ans=false;
                return;
            }
            if(!visited[i]) dfs(i,visited,paths,adj);
        }
        paths[start]=false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ans=true;
        boolean[] visited=new boolean[numCourses];
        boolean[] paths=new boolean[numCourses];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];
            adj.get(b).add(a);
        }

        for(int i=0;i<numCourses;i++){
            if(!visited[i]) dfs(i,visited,paths,adj);
        }
        return ans;
    }
}