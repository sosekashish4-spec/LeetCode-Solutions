class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
       helper(n,0, 0,"",ans);
        return ans;
    }

    private static void helper(int n, int l, int r,String s,List<String>ans){ 
        if(r==n) {
             ans.add(s);
            return;
        }
        if(l!=n) helper(n, l+1, r,s+'(',ans);          //left 
        if(l>r) helper(n, l, r+1,s+')',ans);          //right
    }
}