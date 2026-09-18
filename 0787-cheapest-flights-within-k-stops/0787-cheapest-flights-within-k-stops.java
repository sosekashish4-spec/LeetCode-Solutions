class Triplet implements Comparable<Triplet>{
    int node;
    int dist;
    int stop;
    Triplet(int node,int dist,int stop){
        this.node=node;
        this.dist=dist;
        this.stop=stop;
    }
    public int compareTo(Triplet t){
        if(this.stop==t.stop) return Integer.compare(this.dist,t.dist);
        return Integer.compare(this.stop,t.stop);
    }
}
class Pair{
    int node;
    int weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}
class Solution {
    public void djk(PriorityQueue<Triplet>pq,ArrayList<ArrayList<Pair>>adj,int src, int dst, int k,int []arr){
        pq.add(new Triplet(src,0,0));
        while(pq.size()!=0){
            Triplet front=pq.remove();
            int newflight=front.stop;
            if(newflight==k+1) continue;
            
            for(Pair t:adj.get(front.node)){
                int totaldist=t.weight+front.dist;
                if(arr[t.node]>totaldist){
                    arr[t.node]=totaldist;
                    pq.add(new Triplet(t.node,totaldist,newflight+1));
                }
            }
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] ele:flights){
             int a=ele[0];
             int b=ele[1];
             int c=ele[2];
            adj.get(a).add(new Pair(b,c));
        }

        int []arr=new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[src]=0;

        djk(pq,adj,src,dst,k,arr);
        if(arr[dst]==Integer.MAX_VALUE) return -1;
        return arr[dst];
    }
}