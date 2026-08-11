class Solution {
    static String preToPost(String s) {
        java.util.Stack<String> st = new java.util.Stack<>();
        
        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            // If operand, push to stack
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } else {
                // Operator: pop two operands
                String op1 = st.pop();
                String op2 = st.pop();
                
                // Combine in postfix order
                String expr = op1 + op2 + ch;
                st.push(expr);
            }
        }
        
        // Final postfix expression
        return st.peek();
    }
}
