import java.util.*;

class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (!st.isEmpty() && Math.abs(st.peek() - curr) == 32) {
                st.pop();
            } else {
                st.push(curr);
            }
        }

        StringBuilder ns = new StringBuilder();

        for (char ch : st) {
            ns.append(ch);
        }

        return ns.toString();
    }
}