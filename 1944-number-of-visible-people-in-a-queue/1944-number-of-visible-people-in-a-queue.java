class Solution {
    public int[] canSeePersonsCount(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int [] arr=new int[n];

        int i=n-2;
        int count;
        st.push(nums[n-1]);
        while(i>=0){
            count=0;
            Boolean flag=false;
            while(st.size()>0 && flag==false){
                int top=st.peek();
                if(top<=nums[i]){ 
                st.pop();
                count++;
                }
                if(st.size()>0 && nums[i]<st.peek()){
                    count++;
                    flag=true;
                }
            }
            //if(nums[i]<st.peek()) count ++;
            arr[i]=count;
            st.push(nums[i]);
            i--;
        }
        return arr;
    }
}