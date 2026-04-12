class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        int i = digits.length - 2;
        
        // Step 1: find first decreasing element
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        if (i < 0) return -1;
        
        // Step 2: find just greater element
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        
        // Step 4: reverse right part
        reverse(digits, i + 1, digits.length - 1);
        
        // Convert to number
        long result = Long.parseLong(new String(digits));
        
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}