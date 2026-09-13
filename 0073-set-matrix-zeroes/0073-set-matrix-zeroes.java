class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
    //     HashSet<Integer>row=new HashSet<>();
    //     HashSet<Integer>col=new HashSet<>();
    Queue<Pair>q=new LinkedList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) q.add(new Pair(i,j));
            }
        }
        while(q.size()!=0){
            Pair front=q.remove();
            int row=front.row;
            int col=front.col;
            int i=0;
            while(i<m) matrix[i++][col]=0;

            int j=0;
            while(j<n) matrix[row][j++]=0;
        }
    }
}