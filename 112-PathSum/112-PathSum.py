# Last updated: 8/12/2026, 11:22:12 AM
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def hasPathSum(self, root, targetSum):
        if not root:
            return False

        # If it's a leaf node, check if the value matches targetSum
        if not root.left and not root.right:
            return root.val == targetSum

        
        remaining = targetSum - root.val
        return (self.hasPathSum(root.left, remaining) or
                self.hasPathSum(root.right, remaining))
