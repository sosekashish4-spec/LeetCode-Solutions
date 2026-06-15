class Solution {
    public boolean isPowerOfTwo(int n) {
        // long ans=1;
        // while(n>ans){
        //     ans*=2;
        // }
        // if((int)ans==n) return true;
        // return false;

        //Recursion
        if(n%2!=0 && n!=1||n<=0)return false;
        if(pow(n)==1) return true;
        return false; 
        
    }

    public static int pow(int n){
        if(n==1) return 1;
        if(n%2==1) return 0;
        return pow(n/2);
    }
}