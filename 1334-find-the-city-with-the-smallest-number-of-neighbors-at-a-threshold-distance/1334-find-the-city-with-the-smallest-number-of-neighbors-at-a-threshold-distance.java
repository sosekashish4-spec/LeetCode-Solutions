class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int [][]dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dist[i][j]=0;
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int[] ele:edges){
             int a=ele[0];
             int b=ele[1];
             int c=ele[2];
             dist[a][b]=c;
             dist[b][a]=c;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (dist[j][i] != Integer.MAX_VALUE && dist[i][k] != Integer.MAX_VALUE)
                        dist[j][k] = Math.min(dist[j][i] + dist[i][k], dist[j][k]);
                }
            }
        }
        
        int count;
        int min=Integer.MAX_VALUE;
        int city=2;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(dist[i][j]<=distanceThreshold) count++;
            }
            if(min>=count){
                min=Math.min(min,count);
                city=i;
            }
            
        }
        return city;
    }
}