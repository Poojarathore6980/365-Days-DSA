Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


APPROACH: BOYER-MOORE VOTING ALGORITHM
Description of algorithm :The idea is that the majority element appears more than ⌊n/2⌋ times, so it cannot be completely cancelled out by other elements.

STEPS: 
1. Take variable candidate and count.
2. Traverse through array
3. If count is zero , then current element become candidate.
4. If current element equals to candidate , count increase.
5. If current element not equals to candidate , count decrease.
6. Hence , candidate is the majority element.