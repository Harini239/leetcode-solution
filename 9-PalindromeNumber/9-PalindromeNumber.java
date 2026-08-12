// Last updated: 8/12/2026, 11:23:58 AM
class Solution {
    public boolean isPalindrome(int x) {
    
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        
        return x == reversedHalf || x == reversedHalf / 10;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(121));  
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(10));   
        System.out.println(solution.isPalindrome(0));    
    }
}