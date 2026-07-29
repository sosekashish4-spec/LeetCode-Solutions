class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int []ps=new int[n];
        int []ns=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){    //previous smaller
            while(st.size()!=0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()!=0 && arr[st.peek()]<arr[i]) ps[i]=st.peek();
            if(st.size()==0) ps[i]=-1;
            st.push(i);
        }

        while(st.size()!=0) st.pop();

        for(int j=n-1;j>=0;j--){   //next smaller
            while(st.size()!=0 && arr[st.peek()]>=arr[j]) st.pop();
            if(st.size()!=0 && arr[st.peek()]<arr[j]) ns[j]=st.peek();
            if(st.size()==0) ns[j]=n;
            st.push(j);
        }

        int max=Integer.MIN_VALUE;
        for(int k=0;k<n;k++){
            int area=(ns[k]-ps[k]-1)*arr[k];
            if(area>max) max=area;
        }
        return max;
    }
}