class Solution {
    public int singleNonDuplicate(int[] nums) {
        //int n = nums.length;
        int low = 0, high = nums.length - 1;
         while (low < high) {
            int mid = (low + high) / 2;
            
            // Ensure mid is even
            if (mid % 2 == 1) mid--;
            
            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct → move right
                low = mid + 2;
            } else {
                // Pair breaks → move left
                high = mid;
            }
        }
        return nums[low];
        
        
    }
}