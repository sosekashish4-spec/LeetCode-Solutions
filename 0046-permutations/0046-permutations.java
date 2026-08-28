class Solution {
    private void perm(int[] arr,List<Integer>a,List<List<Integer>>ans,boolean []check) {
        if(a.size()==arr.length){
            List<Integer>copy=new ArrayList<>(a);   //deep copy
            ans.add(copy);
            return;
        }
         for(int i=0;i<arr.length;i++){
            if(!check[i]){
                a.add(arr[i]);
                check[i]=true;
                perm(arr,a, ans, check);
                a.remove(a.size()-1);
                check[i]=false;
               
            }
         }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean []check=new boolean[arr.length];
        List<Integer>a=new ArrayList<>();
        perm(arr,a,ans,check);
        return ans;
    }
}