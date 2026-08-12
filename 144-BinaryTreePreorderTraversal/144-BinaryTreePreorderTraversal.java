// Last updated: 8/12/2026, 11:21:48 AM
import java.util.*;

public class Solution {

    // Build tree from level order array (null means no node)
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // Unified preorderTraversal method (recursive)
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    // Optional iterative preorder traversal
    public static List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    // Main method to test examples
    public static void main(String[] args) {
        Integer[][] testCases = {
            {1, null, 2, 3},
            {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9},
            {},
            {1}
        };

        for (int i = 0; i < testCases.length; i++) {
            TreeNode root = buildTree(testCases[i]);
            List<Integer> preorder = preorderTraversal(root);

            System.out.println("Example " + (i + 1) + ":");
            System.out.println("Input: " + Arrays.toString(testCases[i]));
            System.out.println("Output: " + preorder);
            System.out.println();
        }
    }
}
