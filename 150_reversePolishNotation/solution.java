class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            String ch = tokens[i];
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/") ){
                st.push(Integer.parseInt(ch));
            }
            else{
                int b = st.pop();
                int a = st.pop();
                int result =0;
                if(ch.equals("+")){
                    result = a+b;
                }
                else if(ch.equals("-")){
                    result = a-b;
                }
                else if(ch.equals("*")){
                    result = a*b;
                }
                else{
                    result = a/b;
                }
                st.push(result);

            }
            

        }
        return st.peek();
    }
}