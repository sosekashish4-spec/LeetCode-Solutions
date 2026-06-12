class Solution {
    public int[] searchRange(int[] arr, int x) {
        int []ans={-1,-1};
        int lo=0;
        int hi=arr.length-1;
        int idx=-1;
         
        // if(arr.length==0) return ans;
        // if(arr.length==1){
        //     if(x!=arr[0]) return ans;
        //     else{
        //         ans[0]=0;
        //         ans[1]=0;
        //         return ans;
        //     }
        // }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<x)  lo=mid+1;
            else if(arr[mid]>x)  hi=mid-1;
            else{
                idx=mid; 
                hi=mid-1;
                }  
            }
        ans[0]=idx;

        lo=0;
        hi=arr.length-1;
        idx=-1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if (arr[mid] < x)
                lo = mid + 1;
            else if (arr[mid] > x)
                hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        ans[1]=idx;
        return ans;
    }
}