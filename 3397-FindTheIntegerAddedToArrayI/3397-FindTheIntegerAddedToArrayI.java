// Last updated: 8/12/2026, 11:17:17 AM
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int minnum1 = nums1[0], minnum2 = nums2[0];
        for(int num:nums1){
            minnum1 = Math.min(minnum1,num);
        }
        for(int num:nums2){
            minnum2 = Math.min(minnum2,num);
        }
        return minnum2 - minnum1;
    }
}