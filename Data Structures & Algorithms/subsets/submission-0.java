class Solution {
    List<List<Integer>> ans;

    private void createSets(int ind, int[] nums, List<Integer> curr){
        ans.add(new ArrayList<>(curr));

        for(int i=ind; i<nums.length; i++){
            curr.add(nums[i]);
            createSets(i+1, nums, curr);
            curr.remove(curr.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        createSets(0, nums, new ArrayList<>());
        return ans;
    }
}
