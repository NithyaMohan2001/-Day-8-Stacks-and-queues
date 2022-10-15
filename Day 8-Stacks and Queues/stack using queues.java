class MyStack {

    Queue<Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        int k=q.size();
        for(int i=0;i<k-1;i++){
            Integer first=q.remove();
            q.add(first);
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }