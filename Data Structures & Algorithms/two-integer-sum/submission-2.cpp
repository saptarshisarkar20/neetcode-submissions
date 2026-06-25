class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int tg) {
        unordered_map<int, int> mp;
        vector<int> ans;
        mp[nums[0]]=0;
        for(int i=1; i<nums.size(); i++){
            int x = nums[i];
            if((nums[mp[tg-x]] + x) == tg) return {mp[tg-x], i};

            mp[x] = i;
        }
        return ans;
    }
};
