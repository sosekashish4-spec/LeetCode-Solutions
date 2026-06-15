class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0) return false;
        // long sum=0;
        // int y=x;
        // while(x>0){
        //     int m=x%10;
        //     sum+=m;
        //     sum*=10;
        //     x/=10;
        // }
        // if(sum/10==y) return true;
        // return false;

        //Recursion
        long y=(long)x;
        if(y<0) return false;
        if(y==rev(x,0)) return true;
        return false;
    }
    public static long rev(long x,long sum){
        if(x==0) return sum;
        return rev(x/10,sum*10+x%10);
    }
}