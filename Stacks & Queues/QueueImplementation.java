import java.util.Stack;

public class QueueImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }
}
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStack() { // constructor
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item); // this has O(1) complexity
    }
    public int remove() throws Exception{ // this has O(N) complexity
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek() throws Exception{ // this has O(N) complexity
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
}
