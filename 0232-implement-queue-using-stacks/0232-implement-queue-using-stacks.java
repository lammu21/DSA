class MyQueue {

    public MyQueue() {
        
    }
    Stack <Integer> input = new  Stack<>();
     Stack <Integer> output = new  Stack<>();
    
    public void push(int x) {
        input.push(x);

        
    }
    
    public int pop() {
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }

        }
        int x=output.peek();
        output.pop();
        return x;
        
    }
    
    public int peek() {
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
        
    }
    
    public boolean empty() {
        if(output.size()+input.size()>0){
           return false;
        }
        return true;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */