class MyStack {

    public MyStack() {
        
    }

    Queue <Integer> queueForStack = new LinkedList<>();
    
    public void push(int x) {
    queueForStack.add(x);
    for(int i=0;i<queueForStack.size()-1;i++){
        queueForStack.add(queueForStack.remove());
    }
        
    }
    
    public int pop() {
        return queueForStack.remove();
    }
    
    public int top() {
        return queueForStack.peek();
        
    }
    
    public boolean empty() {
      
      if(queueForStack.size()<=0){
        return true;
      }

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