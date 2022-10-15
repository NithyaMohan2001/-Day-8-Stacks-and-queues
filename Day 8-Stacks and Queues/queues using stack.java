class MyQueue {
    Stack<Integer> pushS=new Stack<>();
   Stack<Integer> popS=new Stack<>();
   public MyQueue() {
       
   }
   
   public void push(int x) {
       pushS.push(x);
   }
   private void convertPushToPops(){
       int size=pushS.size();
       for(int i=0;i<size;i++){
           Integer top=pushS.pop();
           popS.push(top);
       }
   }
   public int pop() {
       if(popS.isEmpty()){
           convertPushToPops();
       }
       return popS.pop();
   }
   
   public int peek() {
     if(popS.isEmpty()){
         convertPushToPops();
     }  
       return popS.peek();
   }
   
   public boolean empty() {
       return pushS.isEmpty() && popS.isEmpty();
   }
}
