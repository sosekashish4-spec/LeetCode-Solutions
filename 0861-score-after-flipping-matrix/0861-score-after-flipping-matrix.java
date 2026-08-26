class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) { //row wise
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] ^= 1;
                }
            }
        }

        for (int i = 0; i < n; i++) { //col wise
            int zer = 0, one = 0;
            for (int j = 0; j < m; j++) {
                if (arr[j][i] == 0) zer++;
                else one++;
            }
            if (zer > one) {
                for (int k = 0; k < m; k++) arr[k][i] ^= 1;
            }
        }
        
        int sum = 0;
        int ones=0 , count=1;
        for(int i = n - 1;i>=0;i--){
            ones = 0;
        for (int j = m - 1; j >= 0; j--) {
            if (arr[j][i] == 1)
                ones++;
        }
        sum += (ones * count);
        count *= 2;
        }
        return sum;
    }
}