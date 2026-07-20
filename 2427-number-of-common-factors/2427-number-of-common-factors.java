class Solution {
    public int commonFactors(int a, int b) {
        int max=(a>b)?a:b;
        int min=(a>b)?b:a;
        int count=0;
        // int ans=(int)Math.sqrt(min);
        // if(max%min==0) ans=min;
        // int i=1;
        // for(;i<ans;i++){
        //     if(max%i==0 && min%i==0){
        //       count ++;
        //       System.out.print(i+" ");
        //     }  
        // }
        // if(max%i==0 && min%i==0)  count ++; 
        for(int i=1;i<=min;i++){
            if(max%i==0 && min%i==0) count ++;
        }
        return count;
    }
}