class Solution {
    public boolean isPowerOfThree(int n) {
         long ans=1;
        while(n>ans){
            ans*=3;
        }
        if((int)ans==n) return true;
        return false;
    }
}