class Solution {
    public void set(List<List<Integer>>ans,List<Integer>sol,int i,int[]nums){
        if(i==nums.length){
            List<Integer>ls=new ArrayList<>(sol);
            ans.add(ls);
            return;
        }
         
         
        sol.add(nums[i]);
        set(ans,sol,i+1,nums);
        sol.remove(sol.size()-1);
        set(ans,sol,i+1,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>sol=new ArrayList<>();
        set(ans,sol,0,nums);
        return ans;
    }
}