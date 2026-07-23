class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=firstele(nums,target);
        ans[1]=lastele(nums,target);
        return ans;

    }
    public int firstele(int[] nums,int target){
        //int[] ans = new int[];
        int left = 0;
        int ans1=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans1=mid;
                right=mid-1;
            }

            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans1;

    }
    public int lastele(int[] nums,int target){
        int left = 0;
        int n = nums.length;
        int right=n-1;
        int ans2=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans2=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans2;
    }
}