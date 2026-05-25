Find the right node of a given node
Given a binary tree and a key in it, find the node which is on same level and on right of this given key. If no such node present return -1.

Complete the function findRightSibling() which takes the address of the root node and an integer key as a parameter and return the right sibling (if exists, otherwise return -1).

﻿Input Format

First Line contains an integer N, denoting the number of integers to follow in the serialized representation of the tree.
Second line contains N space separated integers, denoting the level order description of left and right child of nodes, where -1 signifies a NULL child.
Third line contains an integer key whose right sibling is desired.
Output Format

Print the right sibling if any, otherwise print -1.
Sample Input 1

7
1 2 3 5 -1 -1 8
5
Sample Output 1

8
Explanation 1

        1
       / \
      2    3
     /      \
    5        8
﻿For 5, the right sibling is 8.
Sample Input 2

6
1 2 3 5 6 7
7
Sample Output 2

-1
Explanation 2

        1
       / \
      2    3
     / \  /
    5  6 7
For 7, there is no node present in its right on the same level.
Therefore, the answer is -1.
