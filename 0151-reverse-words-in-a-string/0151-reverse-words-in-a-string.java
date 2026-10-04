class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[]arr=s.split("\\s+");
        String str="";
        int i=0;
        int j=arr.length-1;
        while(i<j){
             String temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }
         
        for( i=0;i<arr.length-1;i++){
            str+=arr[i];
            str+=" ";
        }
        str+=arr[arr.length-1];
        return str;
         
    }
}