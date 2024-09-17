import java.util.*;

public class InBuiltExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);

        int val = stack.pop();
      //System.out.println(val);
        Queue<Integer> queue = new LinkedList<>(); // because Queue is not a class its an interface based on LinkedList
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        //System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(21);
        deque.addLast(90);
        deque.addFirst(89);
        deque.remove(90);


    }
}
