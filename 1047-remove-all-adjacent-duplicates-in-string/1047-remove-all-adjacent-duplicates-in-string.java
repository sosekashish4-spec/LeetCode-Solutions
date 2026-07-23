class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0) st.push(ch);
            else{ 
            char top=st.peek();
            if(ch!=top) st.push(ch);
            else st.pop();
            }
        }

        while(st.size()!=0){
            char ele=st.pop();
            sb.append(ele);
        }
        return sb.reverse().toString();
    }
}