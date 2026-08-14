// Last updated: 8/14/2026, 3:09:57 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        Arrays.sort(nums);
4        int max=0;
5        for(int i=1;i<nums.length;i++){
6            int element=nums[i]-nums[i-1];
7            if(element>max){
8                max=element;
9            }
10        }
11        return max;
12    }
13}