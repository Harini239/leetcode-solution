// Last updated: 8/12/2026, 11:22:34 AM

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }
    
    private boolean isValidBSTHelper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        
        int val = node.val;
        
        // Check current node's value against bounds
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        
        // Left subtree must have values < current node
        if (!isValidBSTHelper(node.left, lower, val)) return false;
        // Right subtree must have values > current node
        if (!isValidBSTHelper(node.right, val, upper)) return false;
        
        return true;
    }
}