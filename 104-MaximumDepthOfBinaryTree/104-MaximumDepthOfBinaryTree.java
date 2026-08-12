// Last updated: 8/12/2026, 11:22:26 AM
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        // Recursively compute the depth of left and right subtrees
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Max of left and right depth + 1 (for current node)
        return Math.max(left, right) + 1;
    }
}