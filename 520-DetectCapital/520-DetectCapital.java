// Last updated: 8/12/2026, 11:20:03 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        int A=0;
        int a=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                A++;
            }
            else if(Character.isLowerCase(word.charAt(i))){
                a++;
            }
        }
        if((A==1 && Character.isUpperCase(word.charAt(0))) || A==word.length() || a==word.length()){
            return true;
        }
        return false;
        
    }
}