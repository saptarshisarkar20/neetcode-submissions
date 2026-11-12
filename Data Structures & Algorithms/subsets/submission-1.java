class Solution {
    List<List<Integer>> ans;

    private void sets(int ind, int[] nums, List<Integer> curr){
        if(ind == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        sets(ind+1, nums, curr);
        curr.add(nums[ind]);
        sets(ind+1, nums, curr);
        curr.remove(curr.size()-1);
        
    }

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        sets(0, nums, new ArrayList<>());
        return ans;
        
    }
}
