// Last updated: 8/12/2026, 11:18:23 AM
class Solution {
    public boolean isThree(int n) {
        int sqrt = (int)Math.sqrt(n);
        
        // Check if n is a perfect square and its square root is prime
        return sqrt * sqrt == n && isPrime(sqrt);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}
