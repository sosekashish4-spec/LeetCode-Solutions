class Solution {
    public int[][] transpose(int[][] arr) {
        int [][]b=new int[arr[0].length][arr.length];
         for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]=arr[j][i];
            }
        }
        return b;
    }
}