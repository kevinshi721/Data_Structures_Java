/**
 * @author kevinshi721
 * @date 8/2/19 11:37 PM
 */

//import java.util.Stack;

class Valid_Parentheses {
    public boolean isValid(String s) {

        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;

                char topChar = stack.pop();
                if (c == ')' && topChar != '(')
                    return false;
                if (c == ']' && topChar != '[')
                    return false;
                if (c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(new Valid_Parentheses().isValid("(){}[]"));
        System.out.println(new Valid_Parentheses().isValid("([)]"));

    }
}
