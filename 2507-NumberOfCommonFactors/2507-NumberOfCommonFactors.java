// Last updated: 8/12/2026, 11:18:02 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }
}
