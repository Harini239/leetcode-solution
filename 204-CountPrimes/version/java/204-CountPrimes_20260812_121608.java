// Last updated: 8/12/2026, 12:16:08 PM
1class Solution {
2    public int countPrimes(int n) {
3        boolean[] prime=new boolean[n];
4        int c=0;
5        for(int i=2;i<n;i++){
6            if(prime[i]==false){
7                c++;
8                for(int j=2;i*j<n;j++){
9                    prime[i*j]=true;
10                }
11            }
12        }
13        return c;
14    }
15}