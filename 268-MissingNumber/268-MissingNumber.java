// Last updated: 8/12/2026, 11:21:05 AM
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.missingNumber(new int[]{3,0,1}));          // Output: 2
        System.out.println(sol.missingNumber(new int[]{0,1}));            // Output: 2
        System.out.println(sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));  // Output: 8
    }
}
