class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans=new int[nums.length];
        int i=0;
        int j=n;
       for(int k=0;k<(nums.length);k++) {
        if(k%2==1){ 
             ans[k]=nums[n+i];
             i++;
        }else ans[k]=nums[i];
       }
       return ans;
    }
}