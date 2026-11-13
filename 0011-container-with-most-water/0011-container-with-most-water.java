class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        int area=0;
        while(i<j){
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                i++;
            }else{
                area=height[j]*(j-i);
                j--;
            }
            max=Math.max(area,max);
        }
        return max;
    }
}