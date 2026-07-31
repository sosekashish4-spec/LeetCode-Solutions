class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int value) {
        if (st.isEmpty()) {
            min = value;
            st.push((long) value);
        } else if (value >= min) {
            st.push((long) value);
        } else {
            st.push(2L * value - min);
            min = value;
        }
    }

    public void pop() {
        long b = st.peek();
        if (min > b)
            min = min + (min - b);
        st.pop();
        if (st.isEmpty())
            min = Long.MAX_VALUE;
    }

    public int top() {
        long a = st.peek();
        if (min > a)
            return (int) min;
        return (int) a;
    }

    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */