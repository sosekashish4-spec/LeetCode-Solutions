public class Triplet implements Comparable<Triplet>{
    int row;
    int col;
    int effort;
    Triplet(int row,int col,int effort){
        this.row=row;
        this.col=col;
        this.effort=effort;
    }
    public int compareTo(Triplet t){
        if(this.effort==t.effort) return this.row-t.row;
        return this.effort-t.effort;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        int m=heights.length;
        int n=heights[0].length;
        int [][]eff=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                eff[i][j]=Integer.MAX_VALUE;
            }
        }
        eff[0][0]=0;
        pq.add(new Triplet(0,0,0));

        while(pq.size()!=0){
            Triplet front=pq.remove();
            int row=front.row;
            int col=front.col;
            int effort=front.effort;
            if(row==m-1 && col==n-1) break;

            if(row>0){ // going upside
                int a=Math.abs(heights[row][col]-heights[row-1][col]);
                a=Math.max(effort,a);
                if(eff[row-1][col]>a){
                    eff[row-1][col]=a;
                    pq.add(new Triplet(row-1,col,a));
                }
            }
            if(col>0){ // going leftside
                int a=Math.abs(heights[row][col]-heights[row][col-1]);
                a=Math.max(effort,a);
                if(eff[row][col-1]>a){
                    eff[row][col-1]=a;
                    pq.add(new Triplet(row,col-1,a));
                }
            }
            if(row<m-1){ // going downside
                int a=Math.abs(heights[row][col]-heights[row+1][col]);
                a=Math.max(effort,a);
                if(eff[row+1][col]>a){
                    eff[row+1][col]=a;
                    pq.add(new Triplet(row+1,col,a));
                }
            }
            if(col<n-1){ // going rightside
                int a=Math.abs(heights[row][col]-heights[row][col+1]);
                a=Math.max(effort,a);
                if(eff[row][col+1]>a){
                    eff[row][col+1]=a;
                    pq.add(new Triplet(row,col+1,a));
                }
            }
        }
        return eff[m-1][n-1];
    }
}