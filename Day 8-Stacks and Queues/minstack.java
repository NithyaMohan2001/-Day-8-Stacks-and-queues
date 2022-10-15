class MinStack {
    //List<Integer> list=new LinkedList<>();
    Stack<Integer> stack=new Stack();
    Stack<Integer> min=new Stack();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(list.isEmpty()|| stack<min_vals)
            return list.add(num);
        //if(!list.isEmpty())
    }
    
    public void pop() {
       // return list.remove(num);
        if(stack.peek().equals(min_vals)){
            min_vals.pop();
        }
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return min_vals.peek();
    }
    
}