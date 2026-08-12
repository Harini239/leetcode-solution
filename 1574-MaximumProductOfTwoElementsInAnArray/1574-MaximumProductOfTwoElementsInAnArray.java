// Last updated: 8/12/2026, 11:19:03 AM
class Solution {
    public int maxProduct(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int num : nums) {
     list.add(num);
}
        int n=Collections.max(list);
        list.set(list.indexOf(n),Integer.MIN_VALUE);
        int m=Collections.max(list);
        return (n-1)*(m-1);

        
    }
}