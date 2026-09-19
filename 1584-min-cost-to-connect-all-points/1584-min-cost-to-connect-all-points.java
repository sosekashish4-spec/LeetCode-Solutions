class Triplet implements Comparable<Triplet>{
    int node;
    int par;
    int wgt;
    Triplet(int node,int par,int wgt){
        this.node=node;
        this.par=par;
        this.wgt=wgt;
    }
    public int compareTo(Triplet t){
        if(this.wgt==t.wgt) return Integer.compare(this.node,t.node);
        return Integer.compare(this.wgt,t.wgt);
    }
}

class Solution {
    static int sum;
    public void minspan(int[][] points,boolean[] visited,int V,PriorityQueue<Triplet>pq){
        pq.add(new Triplet(0,-1,0));

        while(pq.size()!=0){
            Triplet front=pq.remove();
            int node=front.node;
            int par=front.par;
            int wgt=front.wgt;
            if(visited[node]) continue;
            for(int i=0;i<V;i++){
                if(i==node) continue;
                int xi=points[node][0];
                int yi=points[node][1];
                int xj=points[i][0];
                int yj=points[i][1];
                int val=Math.abs(xi-xj)+Math.abs(yi-yj);
                 if(!visited[node]) sum+=wgt;
                visited[node]=true;
                if(!visited[i]) pq.add(new Triplet(i,node,val));
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
         int V=points.length;
         PriorityQueue<Triplet>pq=new PriorityQueue<>();
         boolean[] visited=new boolean[V];
         
         sum=0;
         minspan(points,visited,V,pq);
         return sum;
    }
}