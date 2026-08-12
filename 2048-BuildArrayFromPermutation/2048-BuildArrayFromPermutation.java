// Last updated: 8/12/2026, 11:18:26 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for (int i=0; i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }
}