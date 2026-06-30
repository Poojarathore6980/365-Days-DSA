class Solution {
    public int[] applyOperations(int[] nums) {

        int n = nums.length;

        // Step 1: Apply operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move all non-zero elements to the front
        int write = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[write] = nums[i];
                write++;
            }
        }

        // Step 3: Fill remaining positions with 0
        while (write < n) {
            nums[write] = 0;
            write++;
        }

        return nums;
    }
}