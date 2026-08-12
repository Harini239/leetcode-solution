// Last updated: 8/12/2026, 11:22:10 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        int num=1;
        List <List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            num=1;
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<=i;j++){
                l2.add(num);
                num=num*(i-j)/(j+1);
            }
            l1.add(l2);
        }
        return l1;
    }
}
