class Solution {
    public int xorOperation(int n, int start) {
        int []nums=new int[n];
        int i=0;
        int ans=0;
        for(int j=start;j<=start+(2*n-2);j=j+2){
            nums[i]=j;
            ans^=nums[i++];
         }
         return ans;
    }
}