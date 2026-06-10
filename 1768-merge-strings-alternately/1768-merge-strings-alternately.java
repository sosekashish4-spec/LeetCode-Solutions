class Solution {
    public String mergeAlternately(String word1, String word2) {
        // char []ch= new char[word1.length()+word2.length()];
        // char []str1=word1.toCharArray();
        // char []str2=word2.toCharArray();
        // int i=0;
        // int j=0;
        // int k=0;
        //  while(k<ch.length){
        //     if(i<str1.length) ch[k++]=str1[i++];
        //     else continue;
        //     if(i<str1.length) ch[k++]=str2[j++];
        //     else continue;
        //  }
        //  String ans= new String(ch);
        //  return ans;

        String ans= new String(); 
        int i=0;
        int j=0;
        int k=0;
        int len=word1.length()+word2.length();
         while(k<len){
            if(i<word1.length()) {
                ans+=word1.charAt(i++);
            }
            if(j<word2.length()){ 
                 ans+=word2.charAt(j++);
                 } 
                 k++;
         }
         return ans;
    }
}