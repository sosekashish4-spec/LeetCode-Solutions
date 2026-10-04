class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character>st=new Stack<>();
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(((int)ch>=97 && (int)ch<=122) || ((int)ch>=48 && (int)ch<=57)){
                st.push(ch);
                str+=ch;
            }
        }
        int j=0;
        while(st.size()!=0){
            char chr=st.pop();
            if(chr!=str.charAt(j)) return false;
            j++;
        }
        return true;
    }
}