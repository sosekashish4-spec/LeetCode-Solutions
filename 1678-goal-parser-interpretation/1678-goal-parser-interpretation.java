class Solution {
    public String interpret(String command) {
        String str="";
        char []arr=command.toCharArray();
        int i=0;
        while(i<arr.length){
            if(arr[i]=='G'){
             str+='G';
             i++;
            }     
            else if(arr[i]=='('){
                if(arr[i+1]==')'){
                    str+='o';
                    i=i+2;
                }
                else{
                    str+='a';
                    str+='l';
                    i=i+4;
                }
            }
        }
        return str;
    }
}