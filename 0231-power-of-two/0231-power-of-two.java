class Solution {
    public boolean isPowerOfTwo(int n) {
        long ans=1;
        while(n>ans){
            ans*=2;
        }
        if((int)ans==n) return true;
        return false;
    }
}