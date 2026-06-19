class Solution {
    public int[] constructRectangle(int area) {
        int []arr=new int[2];
        int min=Integer.MAX_VALUE;
        int dif=0;
        for(int i=1;i<=(Math.sqrt(area));i++){
            if(area%i==0){
            int fac=area/i;
            dif=fac-i;
                if(dif<min){
                    dif=min;
                    arr[0]=fac;
                    arr[1]=i;
            }
            }
        }
        return arr;
    }
}