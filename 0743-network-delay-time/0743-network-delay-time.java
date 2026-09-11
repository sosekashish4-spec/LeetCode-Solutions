class Pair{
    int node;
    int dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public void dij(int src,PriorityQueue<Pair>pq,int[]arr,ArrayList<ArrayList<Pair>>adj){
        pq.add(new Pair(src,0));
        while(pq.size()!=0){
            Pair front=pq.remove();
            for(Pair p:adj.get(front.node)){
                int totaldist=front.dist+p.dist;
                if(arr[p.node]>totaldist){
                    arr[p.node]=totaldist;
                    pq.add(new Pair(p.node,totaldist));
                }
            }
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int[]arr=new int[n+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[k]=0;
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            adj.get(u).add(new Pair(v,w));
        }
        dij(k,pq,arr,adj);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(arr[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}