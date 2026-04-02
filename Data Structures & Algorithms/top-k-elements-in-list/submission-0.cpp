class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        vector<pair<int, int>> v;

        for(auto it:nums){
            mp[it]++;
        }

        for(auto it:mp){
            v.push_back({it.second, it.first});
        }
        	sort(v.begin(), v.end(), greater<pair<int,int>>());


        vector<int> ans;

        int i=0;
        while(i<k && i<v.size()){
            ans.push_back(v[i].second);
            i++;
        }

        return ans;
        
    }
};
