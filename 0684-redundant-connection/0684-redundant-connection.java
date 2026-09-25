class Solution {
    static int []parent;
    static int []size;
    static int[]ans;

    public int leader(int x){
        if(parent[x]==x) return x;   //path compression optimization
        parent[x]=leader(parent[x]);
        return parent[x];
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

    public int[] findRedundantConnection(int[][] edges) {
        ans=new int[2];
        int n=edges.length;
        parent=new int[n+1];
        size=new int[n+1];
         
        for(int i=1;i<n+1;i++) {
            parent[i]=i;
            size[i]=1;
        }

        for(int i=0;i<n;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            if(leader(a)==leader(b)){
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
            union(a,b);
        }
        return ans;
    }
}

 