class Solution {
    public boolean safeplaced(int row, int col,char[][] chessBoard) {
        int n=chessBoard.length;
         //upwards
         for(int i=0;i<n;i++){
            if(chessBoard[i][col]=='Q') return false;
         }

         // left-diagonal
         int i=row-1;
         int j=col-1;
         while(i>=0 && j>=0){
            if(chessBoard[i][j]=='Q') return false;
            i--;
            j--;
         }

         // right diagonal
         i=row-1;
         j=col+1;
         while(i>=0 && j<n){
            if(chessBoard[i][j]=='Q') return false;
            i--;
            j++;
         }
         return true;
    }
    
    private void nqueen(int row, char[][] chessBoard,List<List<String>>ans) {
        int n=chessBoard.length;
        List<String>arr;
        if(row==n){
            arr=new ArrayList<>();
            for(int i=0;i<n;i++){
            String s="";
                for(int j=0;j<n;j++){
                    if(chessBoard[i][j]=='Q') s+="Q";
                    else s+=".";
                }
            arr.add(s);
            }
            ans.add(arr);
            return;
        }

        for(int col=0;col<n;col++){
            if(safeplaced(row,col,chessBoard)){
                chessBoard[row][col]='Q';   //mark
                nqueen(row+1, chessBoard,ans);  //recursion
                chessBoard[row][col]='-';   //unmark
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][]chessBoard=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j]='-';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        nqueen(0,chessBoard,ans);
        return ans;
    }
}