// Last updated: 8/12/2026, 11:20:50 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         return rec(n);
    }

    public static boolean rec(int num) {
        if (num <= 0) return false; 
        if (num == 1) return true;  
        if (num % 4 != 0) return false;
        return rec(num / 4);
    }
}
    
