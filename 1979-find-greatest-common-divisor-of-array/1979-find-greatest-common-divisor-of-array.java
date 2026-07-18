class Solution {
    public int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        return gcd(min,max);
    }
}