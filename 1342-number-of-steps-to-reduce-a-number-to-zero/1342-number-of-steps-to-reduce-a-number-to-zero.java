class Solution {
    public int numberOfSteps(int num) {
       return helper(num,0) ;
    }
    public int helper(int n,int m){
        if(n==0) return m;
        if(n%2==0) return helper(n/2,m+1);
        else return helper(n-1,m+1);
    }
}