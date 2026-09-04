class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max;
        int min;
        for(int i=0;i<nums.length;i++){
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k)  return i;
        }
        return -1;
    }
}