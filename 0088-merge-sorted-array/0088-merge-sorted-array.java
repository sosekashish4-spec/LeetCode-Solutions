class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i =0;
        // int j=0;
        // int p=0;
        //  while(i<m || j<n) {
        //     if (nums1[i] <= nums2[j]) i++;
        //     else {
        //         int temp = nums1[i];
        //         nums1[i] = nums2[j];
        //         nums2[j] = temp;
        //         i++;
        //     }
        //    if(nums2[j]>nums2[j+1]) {
        //         int temp = nums2[j];
        //         nums2[j] = nums2[j+1];
        //         nums2[j+1] = temp;
        //    }
        // }

        // for (int k = m; k < m+n; k++) {
        //     nums1[k] = nums2[p++];
        // }
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j+=1;
        }
        Arrays.sort(nums1);
    }
}