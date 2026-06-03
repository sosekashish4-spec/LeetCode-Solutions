class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        int lsum=0;
        int rsum=0;
         for(int i=0;i<n;i++){
            rsum+=arr[i];
         }
        for(int i=0;i<n;i++){ 
                lsum+=arr[i];
            if(lsum==rsum) return i;
                rsum-=arr[i];
         }    
        return -1;
    }
}