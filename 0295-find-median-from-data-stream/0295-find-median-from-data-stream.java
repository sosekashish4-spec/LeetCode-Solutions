class MedianFinder {
    PriorityQueue<Integer>h1;  //min heap
    PriorityQueue<Integer>h2;  //max heap
    public MedianFinder() {
        h1=new PriorityQueue<>();
        h2=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(h1.size()==0) h1.add(num);
        else{
            if(h1.peek()<num) h1.add(num);
            else h2.add(num);
        }
        if(h1.size()-h2.size()>1){
            int top=h1.remove();
            h2.add(top);
        }
        if(h2.size()-h1.size()>1){
            int top=h2.remove();
            h1.add(top);
        }
    }
    
    public double findMedian() {
        if(h1.size()!=h2.size()){
            if(h1.size()>h2.size()) return (double)h1.peek();
            return (double)h2.peek();
        }
        return (h1.peek()+h2.peek())/2.0;
    }
}
public class medianFromDataStream {
    
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */