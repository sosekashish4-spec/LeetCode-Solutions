class Solution {
    public boolean validateStackSequences(int[] a, int[] b) {
        Stack<Integer>st=new Stack<>();
         int i=0 , j=0;
         while(i<=a.length && j<b.length){
            if(st.size()>0 && j<b.length && b[j]==st.peek()){
                st.pop();
                j++;
            }  
            else if(i==a.length && st.peek()!=b[j]) return false;
            else st.push(a[i++]);
         }  
         return true;
    }
}