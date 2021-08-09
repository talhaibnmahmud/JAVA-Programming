import java.util.Stack;

public class StackBalancedBrackets {
    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();

        for(char ch : chars) {
            if(stack.empty()) {
                stack.push(ch);
            } else {
                char peek = stack.peek();

                if(peek == '(' && ch == ')') {
                    stack.pop();
                } else if(peek == '{' && ch == '}') {
                    stack.pop();
                } else if(peek == '[' && ch == ']') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        String[] brackets = {"(()){}()", "({}(", "){})"};

        for(String expression : brackets) {
            String isBalanced = isBalanced(expression) ? "balanced" : "not balanced";
            System.out.println(expression + " is " + isBalanced);
        }
    }
}
