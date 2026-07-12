class Solution{
    public int longestOnes(int[] nums, int k){
        int left = 0,zero=0,maxLen=0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0){
                zero++;
            }
            //invalid window case
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}