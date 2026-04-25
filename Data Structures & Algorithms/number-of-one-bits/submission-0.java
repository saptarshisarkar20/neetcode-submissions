class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        int i=0;
        while(i<32){
            if((n&1) == 1){
                cnt++;
            }
            n = (n>>1);

            i++;
        }
        return cnt;
    }
}
