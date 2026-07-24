class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")){
                int ele=st.pop();
                int top=st.peek();
                int sum=ele+top;
                st.push(ele);
                st.push(sum);
            }else st.push(Integer.parseInt(s));
        }
        int fSum=0;
        while(st.size()!=0){
            int ele=st.pop();
            fSum+=ele;
        }
        return fSum;
    }
}