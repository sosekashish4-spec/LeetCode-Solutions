class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>matrix=new ArrayList<>();
        Arrays.sort(arr);
        int dif=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            dif=arr[i+1]-arr[i];
            if(dif<min) min=dif;
        }
        for(int i=0;i<arr.length-1;i++){
            List<Integer>ans=new ArrayList<>();
            dif=arr[i+1]-arr[i];
            if(dif==min){
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                matrix.add(ans);
            }
        }
        return matrix;
    }
}