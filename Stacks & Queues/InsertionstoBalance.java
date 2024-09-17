import java.util.Stack;
class Solution {
    public int minInsertions(String s) {

        Stack<Character> stack = new Stack<>();
        int insertions = 0;  // To count the number of insertions needed

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);  // Push the '(' onto the stack
            } else {  // The character is ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {  // Check for "))"
                    // If there's a matching '(' on the stack, pop it
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {  // If not, we need to insert a '('
                        insertions++;
                    }
                    i++;  // Skip the next ')'
                } else {  // Only one ')', so we need another ')'
                    // If there's a matching '(' on the stack, pop it
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        insertions++;  // Need to insert an extra ')'
                    } else {  // Need to insert both '(' and ')'
                        insertions += 2;
                    }
                }
            }
            i++;  // Move to the next character
        }

        // At the end, if there are unmatched '(' left in the stack
        while (!stack.isEmpty()) {
            if(stack.pop()=='(') {
                insertions += 2;  // Each '(' needs two ')'
            }
        }

        return insertions;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minInsertions("(()))"));  // Output: 1
        System.out.println(solution.minInsertions("())"));    // Output: 0
        System.out.println(solution.minInsertions("))())(")); // Output: 3
    }
}
