class Solution {
    public int maximumCount(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        int mid=0;

        while(lo<=hi){
            mid=(hi+lo)/2;
            if(nums[mid]>0) hi=mid-1;
            else lo=mid+1;   
        }
        int pos=nums.length-lo;

         lo=0;
         hi=nums.length-1;
         mid=0;
        while(lo<=hi){
            mid=(hi+lo)/2;
            if(nums[mid]<0) lo=mid+1;
            else hi=mid-1;   
        }
        int neg=hi+1;

        int ans=Math.max(neg,pos);
        return ans;
    }
}