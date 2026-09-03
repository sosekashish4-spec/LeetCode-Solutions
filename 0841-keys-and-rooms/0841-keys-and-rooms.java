class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []visited=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(q.size()!=0){
            int front=q.remove();
            for(int ele:rooms.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                } 
            }
        }
        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}