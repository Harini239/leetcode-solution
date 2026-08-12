# Last updated: 8/12/2026, 11:22:13 AM
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def minDepth(self, root):
        if not root:
            return 0

        queue = deque([(root, 1)])  # (node, current_depth)

        while queue:
            node, depth = queue.popleft()

            # If it's a leaf node
            if not node.left and not node.right:
                return depth

            if node.left:
                queue.append((node.left, depth + 1))
            if node.right:
                queue.append((node.right, depth + 1))
