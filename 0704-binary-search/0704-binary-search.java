class Solution {
    public int search(int[] nums, int target) {
        // int lo=0;
        // int hi=nums.length-1;
        // while(lo<=hi){
        //     int mid=((hi-lo)/2)+lo;
        //     if(nums[mid]<target) lo=(mid+1);
        //     else if(nums[mid]>target) hi=(mid-1);
        //     else return mid;
        // }
        // return -1;

        //Recursion
        return bin(0,nums.length-1,target,nums);
    }
    public static int bin(int lo,int hi,int target,int[] arr){
        int mid=(hi-lo)/2+lo;
        if(lo>hi) return -1;
        if(arr[mid]>target) return bin(lo,mid-1,target,arr);
        else if(arr[mid]==target) return mid;
        else return bin(mid+1,hi,target,arr);
    }
}