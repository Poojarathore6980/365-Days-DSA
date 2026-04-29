class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: edge cases
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Step 2: reverse half
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // Step 3: compare
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}