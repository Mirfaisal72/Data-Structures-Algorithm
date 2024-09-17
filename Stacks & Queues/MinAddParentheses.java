import java.util.Stack;

public class MinAddParentheses {
    public static void main(String[] args) {
        String str = "(())(";
        int ans = minParentheses(str);
        System.out.println(ans);
    }
    public static int minParentheses(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
