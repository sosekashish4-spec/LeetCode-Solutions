class Pair{
    int node;
    double dist;
    Pair(int node,double dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public void dij(int src,PriorityQueue<Pair>pq,double[]arr,ArrayList<ArrayList<Pair>>adj){
        pq.add(new Pair(src,1.0));
        while(pq.size()!=0){
            Pair front=pq.remove();
            for(Pair p:adj.get(front.node)){
                double totaldist=front.dist*p.dist;
                if(arr[p.node]<totaldist){
                    arr[p.node]=totaldist;
                    pq.add(new Pair(p.node,totaldist));
                }
            }
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a, b) -> Double.compare(b.dist, a.dist));
        double[]arr=new double[n];
        Arrays.fill(arr,0.0);
        arr[start_node]=1.0;
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double w=succProb[i];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        dij(start_node,pq,arr,adj);
        return arr[end_node];
    }
}