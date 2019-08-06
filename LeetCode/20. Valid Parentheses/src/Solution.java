/**
 * @author kevinshi721
 * @package PACKAGE_NAME
 * @date 8/5/19 10:27 PM
 */
public class Solution {


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

        System.out.println(new Solution().isValid("(){}[]"));
        System.out.println(new Solution().isValid("([)]"));

    }
}
