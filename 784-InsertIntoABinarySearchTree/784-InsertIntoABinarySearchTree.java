// Last updated: 8/12/2026, 11:19:38 AM
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            // If we reached a null spot, insert the new node here
            return new TreeNode(val);
        }
        
        if (val < root.val) {
            // Insert into the left subtree
            root.left = insertIntoBST(root.left, val);
        } else {
            // Insert into the right subtree
            root.right = insertIntoBST(root.right, val);
        }
        
        return root; // Return the unchanged root node
    }
}