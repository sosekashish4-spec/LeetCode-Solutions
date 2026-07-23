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
        Stack<Character>st1=new Stack<>();
        reverse(st,st1);
        while(st1.size()!=0){
            char ele=st1.pop();
            sb.append(ele);
        }
        return sb.toString();
    }
    public void reverse(Stack<Character>a,Stack<Character>b){
        while(a.size()!=0){
            char ch=a.pop();
            b.push(ch);
        }
    }
}