// Last updated: 8/14/2026, 12:30:17 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] prime=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++){
            if(prime[i]==false){
                c++;
                for(int j=2;i*j<n;j++){
                    prime[i*j]=true;
                }
            }
        }
        return c;
    }
}