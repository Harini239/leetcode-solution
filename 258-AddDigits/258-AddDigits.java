// Last updated: 8/12/2026, 11:21:09 AM
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addDigits(38)); 
        System.out.println(sol.addDigits(0));
    }
}
