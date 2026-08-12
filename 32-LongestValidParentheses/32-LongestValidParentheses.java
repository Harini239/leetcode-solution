// Last updated: 8/12/2026, 11:23:20 AM
class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int c=0;
        if(n==0){
            return 0;
        }
        Stack<Integer> s1=new Stack<>();
        s1.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                s1.push(i);
            }
            else{
                s1.pop();
            }
            if(s1.isEmpty()){
                s1.push(i);
            }
            else{
                c=Math.max(c, i - s1.peek());
            }
        }
        
        return c;
    }
}