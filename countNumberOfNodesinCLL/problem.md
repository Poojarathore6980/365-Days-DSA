Given a circular linked list, the task is to count the number of nodes in the list.

A circular linked list is a linked list where the last node points back to the head node, forming a loop.

📥 Input
The function receives a pointer/reference to the head of the circular linked list.
📤 Output
Return an integer representing the total number of nodes in the circular linked list.
📌 Example
Example 1:

Input:
Linked List: 1 → 2 → 3 → 4 → (back to 1)

Output:
4

Example 2:

Input:
Linked List: 10 → (back to 10)

Output:
1

⚠️ Constraints
1≤Number of nodes≤10
5