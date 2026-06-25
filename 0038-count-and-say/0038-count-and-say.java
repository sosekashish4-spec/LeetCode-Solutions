class Solution {
    public String countAndSay(int n) {
     if(n==1) return "1";
        String s=countAndSay(n-1);
        String ans="";
        
        int i=0;
        int j=0;
        for(int k=0;k<2*s.length();k++){
            if(j==s.length()-1 && s.charAt(i)==s.charAt(j)){
                ans+=(j-i+1) ;
                ans+=s.charAt(i);
                return ans;
            }
            else if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                ans+=(j-i);
                ans+=s.charAt(i);
                i=j;
            }
        }
        return ans;

    }
}