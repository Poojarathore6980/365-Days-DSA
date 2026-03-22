Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 
APPROACH :
Approach (Floyd’s Cycle Detection)
🔹 Step 1: Treat array like a linked list
Each index points to nums[index]
This creates a chain of jumps
Because one number is duplicated → cycle forms
🔹 Step 2: Initialize pointers
slow = nums[0]
fast = nums[0]
🔹 Step 3: Find intersection point (cycle detection)
Move:
slow = nums[slow] (1 step)
fast = nums[nums[fast]] (2 steps)
Continue until slow == fast

 This guarantees meeting inside the cycle

🔹 Step 4: Find cycle starting point
Reset: slow = nums[0]
Move both one step:
slow = nums[slow]
fast = nums[fast]
When they meet → duplicate number
🔹 Step 5: Return result
Return slow (or fast)

TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)