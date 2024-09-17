import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
            String str = "([]})";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If closing bracket, check if it matches the top of the stack
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        // If the stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }
}
