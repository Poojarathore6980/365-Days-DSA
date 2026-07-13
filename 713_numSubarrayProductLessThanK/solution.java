class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int left = 0;
        int n = nums.length;
        int count = 0;
        int product =1;
        for(int r = 0;r<n;r++){
            product *=nums[r];
            
            while(product>=k && left<=r){
            product/=nums[left];
            left++;
            }
            count+=(r-left+1);
        }
        return count;

        
    }
}
