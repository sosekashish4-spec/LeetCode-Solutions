class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int target=(n/2);
        int count =0;
         return nums[target];
    }
}