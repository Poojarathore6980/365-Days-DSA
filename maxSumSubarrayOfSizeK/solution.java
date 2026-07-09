class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int n = arr.length;
       int windowSum=0;
        for(int i = 0;i<k;i++){
            windowSum += arr[i];
            
        }
       
        int maxSum = windowSum;
        // slide the window
        for(int i = k;i<n;i++){
            windowSum = windowSum-arr[i-k];
            // add new index
            windowSum = windowSum+arr[i];
            //update maxSum
            maxSum = Math.max(windowSum,maxSum);
            
        }
        return maxSum;
        
        
        
        
    }
}