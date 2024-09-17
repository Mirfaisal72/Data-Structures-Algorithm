public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack(){ //constructor without argument
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){ // constructor with argument
        this.data = new int[size]; // make an array in heap with size "size"
    }
    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is Empty");
        }
        top++;
        data[top] = item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
             throw new Exception("Stack is Empty");
        }
        int removed = data[top];
        return removed;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[top];
    }

    public boolean isFull(){
        if(top == data.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(data[i] + " ");
        }
    }


}
