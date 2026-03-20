Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Approach (Kadane’s Algorithm)

Goal: Maximum sum of a contiguous subarray.

Steps:

currentSum = 0

maxSum = nums[0]

Loop through array:

currentSum += nums[i]

maxSum = max(maxSum, currentSum)

If currentSum < 0 → reset to 0

Why it works:

Negative prefix future sum ko sirf kam karega

Positive prefix future sum ko badhata hai

Time Complexity: O(n)

Space Complexity: O(1)