class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0, cnt = 1, last_smaller = Integer.MIN_VALUE;
        if (nums.length <= 1)
            return nums.length;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == last_smaller) {
                cnt+=1;
                last_smaller = nums[i];
                System.out.println(nums[i]);
            } else if (nums[i] != last_smaller) {
                cnt = 1;
                last_smaller = nums[i];
            }
            ans = Math.max(ans, cnt);
        }
        return ans+1;
    }
}
