class Solution {
    public void sortColors(int[] nums) {
         int zero = 0;
        int one = 0;
        int two = 0;

        // First pass: Count 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else {
                two++;
            }
        }
        int index = 0;
         for (int i = 0; i < zero; i++) {
            nums[index] = 0;
            index++;
        }
         for (int i = 0; i < zero; i++) {
            nums[index] = 0;
            index++;
        }
        for (int i = 0; i < two; i++) {
            nums[index] = 2;
            index++;
        }


       
    }
}