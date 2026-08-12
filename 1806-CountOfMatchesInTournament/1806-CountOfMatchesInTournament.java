// Last updated: 8/12/2026, 11:18:42 AM
class Solution {
    public int numberOfMatches(int n) {
        return n - 1;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfMatches(7));  
        System.out.println(solution.numberOfMatches(14)); 
        System.out.println(solution.numberOfMatches(1));  
        System.out.println(solution.numberOfMatches(100)); 
    }
}