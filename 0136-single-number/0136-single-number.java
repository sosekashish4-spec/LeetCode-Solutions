class Solution {
    public int singleNumber(int[] nums) {
       // Using XOR
       int ans=nums[0];
       for(int i=1;i<nums.length;i++){
            ans^=nums[i];
       }
       return ans;
    }
}