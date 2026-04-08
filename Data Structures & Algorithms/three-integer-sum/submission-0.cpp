class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> ans;

        for(int i=0; i<nums.size()-1; i++){
            int x = nums[i];
            unordered_map<int,int> mp;
            for(int j=i+1; j<nums.size(); j++){
                int tg = -(x+nums[j]);
                if(mp[tg]!= 0) {
                    vector<int> temp = {nums[i], nums[mp[tg]] , nums[j]};
                    sort(temp.begin(), temp.end());
                    ans.insert(temp);
                }
                mp[nums[j]] = j;
            }
        }
        vector<vector<int>> res;
        for(auto it: ans) res.push_back(it);

        return res;
    }
};
