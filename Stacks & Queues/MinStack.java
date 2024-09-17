import java.util.Stack;

public class MinStack {
    // Global declarations
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
       MinStack stack = new MinStack(); // Create an instance of MinStack
        stack.push(10);
        stack.push(12);
        stack.push(89);
        stack.push(46);
        stack.push(6);
        stack.push(45);

        System.out.println("The topmost element in Main Stack is " + stack.top());
        System.out.println("The minimum element in Main Stack is " + stack.min());
    }

    // Method to push elements into the stack
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    // Method to pop elements from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    // Method to get the top element
    public int top() {
        return stack.peek();
    }

    // Method to get the minimum element
    public int min() {
        return minStack.peek(); // This will be the minimum element that is on top of min Stack
    }
}
