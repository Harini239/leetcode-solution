// Last updated: 8/12/2026, 11:17:31 AM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int left = 0;
        int right = 0;


        for(int num: nums1)
        {
            set1.add(num);
        }
        for(int num: nums2)
        {
            set2.add(num);
        }

        for(int num : nums1)
        {
            if(set2.contains(num))
            {
                left++;
            }
        }
        for(int num : nums2)
        {
            if(set1.contains(num))
            {
                right++;
            }
        }
        return new int[] {left,right};
    }
}