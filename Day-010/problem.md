Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

APPROACH:

 
Problem Understanding
If any cell in the matrix is 0, set its entire row and column to 0.
Modification must be done in-place.
2. Key Idea
Use first row and first column as markers instead of extra space.
3. Additional Variables
firstRowZero: to track if first row initially contains 0
firstColZero: to track if first column initially contains 0
4. Algorithm Steps
Step 1: Check First Row
If any element in first row is 0, set firstRowZero = true.

Step 2: Check First Column
If any element in first column is 0, set firstColZero = true.

Step 3: Mark Rows and Columns
Traverse matrix from (1,1) to (m-1,n-1)
If matrix[i][j] == 0:
Set matrix[i][0] = 0 (mark row)
Set matrix[0][j] = 0 (mark column)

Step 4: Update Matrix
Traverse again from (1,1) to (m-1,n-1)
If:
matrix[i][0] == 0 OR matrix[0][j] == 0
Set matrix[i][j] = 0

Step 5: Update First Row
If firstRowZero == true, set entire first row to 0

Step 6: Update First Column
If firstColZero == true, set entire first column to 0

5. Complexity
Time: O(m × n)
Space: O(1)

6. Key Insight
Mark first, then update
Reuse matrix to avoid extra space

