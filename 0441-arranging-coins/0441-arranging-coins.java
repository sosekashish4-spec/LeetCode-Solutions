class Solution {
    public int arrangeCoins(int n) {
        long z=(long)n;
        int m=(int)Math.sqrt(8*z+1);
        int k=(m-1)/2;
        return k;
    }
}