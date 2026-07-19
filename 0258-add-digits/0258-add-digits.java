class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        if(num%10==num) return num;
        int m=0;
        int sum=0;
        while(num!=0){
            m=num%10;
            sum+=m;
            num/=10;
        }
        return addDigits(sum);  
    } 
}