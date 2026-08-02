class MyStack {
    Queue<Integer> q=new LinkedList<>();
    public MyStack() {          //POP & PEEK efficient Approach
        
    }
    
    public void push(int x) {       //O(n)
        q.add(x);
        int n=q.size();
        for(int i=1;i<n;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {              //O(1)
        return q.remove();
    }
    
    public int top() {             //O(1)
        return q.peek();
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