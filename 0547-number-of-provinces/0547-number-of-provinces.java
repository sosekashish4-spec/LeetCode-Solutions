class Solution {
    static int []parent;
    static int []size;

    public int leader(int x){
        if(parent[x]==x) return x;
        int leader=parent[x];   //path compression optimization
        parent[x]=leader;
        return leader;
    }

    public void union(int a,int b){
        int c=leader(a);
        int d=leader(b);
        if(c!=d){
            if(size[c]>size[d]){ //optimization with size array 
                parent[d]=c;
                size[c]+=size[d];
            }else{
                parent[c]=d;
                size[d]+=size[c];
            }
        }  
    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        parent=new int[n+1];
        size=new int[n+1];
         
        for(int i=1;i<n+1;i++) {
            parent[i]=i;
            size[i]=1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    union(i+1,j+1);
                }
            }
        }
       
        int count=0;
        for(int j=1;j<n+1;j++){
            if(parent[j]==j) count++;
        }
        return count;
    }
}