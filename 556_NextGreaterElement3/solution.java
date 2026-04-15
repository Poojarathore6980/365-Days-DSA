class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        // Step 1: Find the first decreasing element from the right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        if (i < 0) return -1; // No next permutation possible
        
        // Step 2: Find the smallest digit greater than digits[i] to the right
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap
        swap(digits, i, j);
        
        // Step 4: Reverse the suffix
        reverse(digits, i + 1, digits.length - 1);
        
        // Convert back to number
        long val = Long.parseLong(new String(digits));
        
        // Check if within 32-bit integer range
        return (val > Integer.MAX_VALUE) ? -1 : (int) val;
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}
