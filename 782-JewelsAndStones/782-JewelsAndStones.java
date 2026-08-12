// Last updated: 8/12/2026, 11:19:43 AM
class Solution {
    public int numJewelsInStones(String j, String s) {
        boolean[] jewel = new boolean[124];

        for(int i = 0; i < j.length(); i++) jewel[j.charAt(i)] = true;

        int count = 0;
        for(int i = 0; i < s.length(); i++) if(jewel[s.charAt(i)]) count++;

        return count;
    }
}