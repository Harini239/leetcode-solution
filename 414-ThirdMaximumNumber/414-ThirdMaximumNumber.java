// Last updated: 8/12/2026, 11:20:24 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); 
        
        int count = 1;  
        int last = nums[nums.length - 1]; 
    
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != last) {   
                count++;
                last = nums[i];
            }
            if (count == 3) return last;  
        }
        
        return nums[nums.length - 1];
    }
}
