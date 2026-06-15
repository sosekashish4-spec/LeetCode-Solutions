class Solution {
    public boolean isPowerOfThree(int n) {
        //  long ans=1;
        // while(n>ans){
        //     ans*=3;
        // }
        // if((int)ans==n) return true;
        // return false;

        //Recursion

        if(n<=0) return false;
        if(pow(n)==1) return true;
        return false;
    }
    public static int pow(int m){
        if(m==1) return 1;
        if(m%3!=0) return 0;
        return pow(m/3);
    }
}