// Last updated: 8/12/2026, 11:19:53 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet();

        for (int num : candyType) {
            set.add(num);
            if (set.size() == candyType.length / 2) {
                break;
            }
        }

        return set.size();
    }
}