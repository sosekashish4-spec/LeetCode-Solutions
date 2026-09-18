class Pair implements Comparable<Pair>{
    int node;
    long time;
    Pair(int node,long time){
        this.node=node;
        this.time=time;
    }
    public int compareTo(Pair p){
        if(this.time==p.time) return Integer.compare(this.node,p.node);
        return Long.compare(this.time,p.time);
    }
}
class Solution {
    public void djk(PriorityQueue<Pair>pq,ArrayList<ArrayList<Pair>>adj,int src, int dst,long []arr,int []ways){
        pq.add(new Pair(src,0));
        while(pq.size()!=0){
            Pair front=pq.remove();
 
            for(Pair p:adj.get(front.node)){
                long totaldist=p.time+front.time;

                if(arr[p.node]>totaldist){
                    arr[p.node]=totaldist;
                    ways[p.node]=ways[front.node];
                    pq.add(new Pair(p.node,totaldist));
                }else if(arr[p.node]==totaldist){
                    ways[p.node]=(ways[p.node]+ways[front.node])%1000000007;
                }
            }
        }
    }
    public int countPaths(int n, int[][] roads) {
        int []ways=new int[n];
        ways[0]=1;
        int dst=n-1;
        int src=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] ele:roads){
             int a=ele[0];
             int b=ele[1];
             int c=ele[2];
            adj.get(a).add(new Pair(b,c));
            adj.get(b).add(new Pair(a,c));
        }

        long []arr=new long[n];
        Arrays.fill(arr,Long.MAX_VALUE);
        arr[src]=0;

        djk(pq,adj,src,dst,arr,ways);
        return ways[dst] ;
    }
}