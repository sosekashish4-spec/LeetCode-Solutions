class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[]arr=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        for(int k=nums.length-1;k>=0;k--){
            st.push(nums[k]);
        }
        int i=nums.length-1;
        while(i>=0){
            while(st.size()!=0 && st.peek()<=nums[i]) st.pop();
            if(st.size()==0) arr[i]=-1;
            else arr[i]=st.peek();
            st.push(nums[i--]);
        }
        return arr;
    }
}