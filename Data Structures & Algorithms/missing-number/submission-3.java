class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0, ind=0;
        for (int i : nums) {
            ans = ans ^ i;
            ans = ans ^ ind;
            ind++;
        }
        ans = ans ^ nums.length;
        return ans;
    }
}
