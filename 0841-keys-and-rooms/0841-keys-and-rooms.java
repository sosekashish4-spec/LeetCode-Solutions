class Solution {
    public void dfs(List<List<Integer>> rooms,boolean []visited,int i){
        visited[i]=true;
        for(int ele:rooms.get(i)){
            if(!visited[ele]){
                visited[ele]=true;
                dfs(rooms,visited,ele);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []visited=new boolean[n];
        dfs(rooms,visited,0);
    
        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}