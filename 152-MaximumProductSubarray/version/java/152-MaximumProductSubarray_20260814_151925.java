// Last updated: 8/14/2026, 3:19:25 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=nums[0];
4        for(int i=0;i<nums.length;i++){
5            int p=1;
6            for(int j=i;j<nums.length;j++){
7                p=p*nums[j];
8                if(p>max){
9                    max=p;
10                }
11            }
12        }
13        return max;
14    }
15}