class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    public int[] mergeSort(int []arr){
        int n=arr.length;
        if(arr.length==1) return arr;
        int []a=new int[n/2];
        int []b=new int[n-n/2];

        int idx=0;
        for(int i=0;i<a.length;i++) a[i]=arr[idx++];
        for(int j=0;j<b.length;j++) b[j]=arr[idx++];

        mergeSort(a);
        mergeSort(b);

        return merge(a,b,arr);
    }

    public int[] merge(int []a,int []b,int []arr){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]>b[j]) arr[k++]=b[j++];
            else arr[k++]=a[i++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];

        return arr;
    }
}