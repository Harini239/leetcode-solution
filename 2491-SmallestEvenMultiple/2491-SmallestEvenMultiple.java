// Last updated: 8/12/2026, 11:18:06 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int n1 = 5;
        System.out.println(solution.smallestEvenMultiple(n1)); 

       
        int n2 = 6;
        System.out.println(solution.smallestEvenMultiple(n2)); 
    }
}
