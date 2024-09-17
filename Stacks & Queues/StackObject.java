public class StackObject {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        DynamicStack stack1 = new DynamicStack();
        System.out.println(stack.pop());
        System.out.println(stack.push(10));
        System.out.println(stack.push(11));
        System.out.println(stack.push(12));
        System.out.println(stack.push(13));
        System.out.println(stack.push(14));
        System.out.println(stack.push(15));
        stack.display();
        //System.out.println(stack.peek());
        //System.out.println(stack.pop());

    }
}
