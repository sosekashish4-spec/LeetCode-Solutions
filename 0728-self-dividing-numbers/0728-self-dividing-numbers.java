class Solution {
    public int selfDiv(int num){
        int numb=num;
        while(num!=0){
            int rem=num%10;
            if(rem==0 || numb%rem!=0) return 0;
            num/=10;
        }
        return numb;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans=new ArrayList<>();
        int i=left;
         while(i!=right+1){
            int n=selfDiv(i++);
            if(n!=0) ans.add(n);
         }
         return ans;
    }
}