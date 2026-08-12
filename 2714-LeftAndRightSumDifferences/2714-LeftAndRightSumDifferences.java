// Last updated: 8/12/2026, 11:17:51 AM
public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];

        // Compute leftSum
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        // Compute rightSum
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // Compute answer array
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {10, 4, 8, 3};
        int[] res1 = sol.leftRightDifference(nums1);
        for (int val : res1) System.out.print(val + " ");  // Output: 15 1 11 22
        System.out.println();

        int[] nums2 = {1};
        int[] res2 = sol.leftRightDifference(nums2);
        for (int val : res2) System.out.print(val + " ");  // Output: 0
    }
}
