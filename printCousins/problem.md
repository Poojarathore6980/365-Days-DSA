Given a binary tree and a key value from this tree, print all the cousins of this node separated by space. If no cousin exists print -1.

Complete the function printCousins() which takes the address of the root node and a key k as a parameter and print the cousins of k separated by space or -1 if no cousin exists.

Input Format

First line contains the total number of nodes, second line contains the node labels separated by space. Third line contains an integer key k whose cousins are desired.
Output Format

For each test case, print the cousins of given key separated by space in new lines.
Sample Input

6
1 2 3 4 5 6
2
Sample Output

-1
Explanation:

        1
       / \
      2    3
     / \  /
    4  5 6
The parent of node 2 is 1, who have no siblings, no cousins for node 2.
If key is 6, then 2 is the sibling of parent i.e. 3. So the cousins are 4 and 5﻿.