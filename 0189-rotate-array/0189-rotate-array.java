class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int[] arr1=new int[nums.length-k];
        int[] arr2=new int[k];
        int i=0;
         for(;i<arr1.length;i++){
            arr1[i]=nums[i];
         }
         for(int j=0;j<arr2.length;j++){
            arr2[j]=nums[i++];
         }

         int z=0;
         for(;z<arr2.length;z++){
            nums[z]=arr2[z];
         }
         for(int l=0;l<arr1.length;l++){
            nums[z++]=arr1[l];
         }
    }
}