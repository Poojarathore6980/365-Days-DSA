class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }
           else if(!st.isEmpty()){
            st.pop();
           }
        }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        return ans.toString();
    }
}