// Last updated: 8/12/2026, 11:19:12 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;  
            product *= digit;     
            sum += digit;        
            n /= 10;              
        }

        return product - sum;
    }

   
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.subtractProductAndSum(234));  
        System.out.println(solution.subtractProductAndSum(4421)); 
        System.out.println(solution.subtractProductAndSum(10));   
        System.out.println(solution.subtractProductAndSum(5));    
    }
}