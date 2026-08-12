// Last updated: 8/12/2026, 11:21:45 AM
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

    // Recursive postorder traversal
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private static void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result);   // left
        postorderHelper(node.right, result);  // right
        result.add(node.val);                  // root
    }

    // Iterative postorder traversal
    public static List<Integer> postorderTraversalIterative(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val); // add to front instead of end

            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        return result;
    }

    // Main method to test the examples
    public static void main(String[] args) {
        Integer[][] testCases = {
            {1, null, 2, 3},
            {1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9},
            {},
            {1}
        };

        for (int i = 0; i < testCases.length; i++) {
            TreeNode root = buildTree(testCases[i]);

            List<Integer> postorderRec = postorderTraversal(root);
            List<Integer> postorderIter = postorderTraversalIterative(root);

            System.out.println("Example " + (i + 1) + ":");
            System.out.println("Input: " + Arrays.toString(testCases[i]));
            System.out.println("Output (Recursive): " + postorderRec);
            System.out.println("Output (Iterative): " + postorderIter);
            System.out.println();
        }
    }
}
