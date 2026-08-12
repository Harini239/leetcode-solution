// Last updated: 8/12/2026, 11:19:24 AM
class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(2)); // Output: 1
        System.out.println(solution.fib(3)); // Output: 2
        System.out.println(solution.fib(4)); // Output: 3
    }
}
