class Solution {
    public int largestAltitude(int[] arr) {
        int psum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(max<psum)
                 max=psum;
        }
        return max;
    }
}