You are given a string s that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

Examples:

Input: s = "+AB"
Output: "AB+"
Explanation: In postfix form, operands come first followed by operator.
Prefix to Infix: +AB becomes A + B
Infix to Postfix: A + B becomes AB+
Input: s = "*+ABC"
Output: AB+C*
Explanation: 
Prefix to Infix: *+ABC becomes (A + B)*C
Infix to Postfix: (A + B)*C becomes AB+C* 
Input: s = "*-A/BC-/AKL"
Output: "ABC/-AK/L-*"