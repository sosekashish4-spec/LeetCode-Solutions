class MyStack {
    Queue<Integer> q=new LinkedList<>();
    public MyStack() {          //Push efficient Approach
        
    }
    
    public void push(int x) {       //O(1)
        q.add(x);
    }
    
    public int pop() {              //O(n)
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {             //O(n)
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
        int ans=q.peek();
        q.add(q.remove());
        return ans;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */