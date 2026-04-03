Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

We maintain a stack of indices such that heights are in increasing order.

When we find a bar smaller than the top:

It means we can now calculate area for previous taller bars
🔥 Steps
Traverse all bars
Maintain stack (increasing heights)
If current bar is smaller:
Pop from stack

Calculate area:

height = popped bar
width = current index - stack.peek() - 1
After loop, process remaining stack