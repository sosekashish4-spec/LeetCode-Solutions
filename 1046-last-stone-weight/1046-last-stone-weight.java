class Solution {
    public int lastStoneWeight(int[] stones) {
        //Max Heap
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones) pq.add(ele);
        int n=0;
        int diff=0;
        int m=0;
        while(pq.size()!=1){
            m=pq.remove();
            if(pq.size()!=0) n=pq.remove();
             
            diff=Math.abs(m-n);
            pq.add(diff);
        }
        return pq.peek();
    }
}