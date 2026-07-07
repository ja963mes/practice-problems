class Solution {
    public boolean isValid(String s) {
        Stack<Character> stak = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stak.push(c);
            } else if (!stak.isEmpty() && (
                (c == ')' && stak.peek() == '(') ||
                (c == '}' && stak.peek() == '{') ||
                (c == ']' && stak.peek() == '['))) {
                stak.pop();
            } else {
                return false; // mismatched or no open bracket to close
            }
        }
        return stak.isEmpty();
    }
}