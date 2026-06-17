class Solution {
    public int romanToInt(String s) {
        char[]arr={'I','V','X','L','C','D','M'};
        int []nums={1,5,10,50,100,500,1000};
        int n=s.length()-1;
        int sum=0;
        int prev=0;
       for(int i=n;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(s.charAt(i)==arr[j]){
                    if(j>=prev) sum+=nums[j];
                    else sum-=nums[j];
                     prev=j;
                }
            }
       } 
       return sum;
    }
}