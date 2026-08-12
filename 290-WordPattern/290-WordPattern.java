// Last updated: 8/12/2026, 11:20:59 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Object, Integer>map=new HashMap<>();
        String[] str=s.split(" ");
        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<str.length;i++){
            if(!Objects.equals(map.put(pattern.charAt(i),i),map.put(str[i],i))){
                return false;
            }
        }
        return true;
    }
}