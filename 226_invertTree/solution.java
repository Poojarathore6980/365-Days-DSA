class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        // swap left and right nodes
       TreeNode left=root.left;
       TreeNode right=root.right;
        // recursively exchange nodes
        root.left=invertTree(right);
        root.right=invertTree(left);
        return root;

        
    }
}