// Last updated: 8/12/2026, 11:21:10 AM
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       return false;
       char[] a=s.toCharArray();
       char[] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       return Arrays.equals(a,b); 
    }
}