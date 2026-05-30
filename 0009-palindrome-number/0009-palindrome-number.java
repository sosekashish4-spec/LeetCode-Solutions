class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long sum=0;
        int y=x;
        while(x>0){
            int m=x%10;
            sum+=m;
            sum*=10;
            x/=10;
        }
        if(sum/10==y) return true;
        return false;
    }
}