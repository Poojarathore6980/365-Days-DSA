public int lengthOfLongestSubstring(String s) {
        int maxLen = Integer.MIN_VALUE;
        int n = s.length();
        if(n==0){
            return 0;
        }
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while(right<n){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxLen = Math.max(maxLen,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
        
        
    }
}