class Solution {
    List<List<Integer>> ans;

    private void getAns(int ind, int[] nums, int tg, List<Integer> curr) {
        if (0 == tg) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (ind >= nums.length || tg < 0)
            return;

        getAns(ind + 1, nums, tg, curr);
        curr.add(nums[ind]);
        getAns(ind, nums, tg - nums[ind], curr);
        curr.removeLast();
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans = new ArrayList<>();
        getAns(0, nums, target, new ArrayList<>());
        return ans;
    }
}
