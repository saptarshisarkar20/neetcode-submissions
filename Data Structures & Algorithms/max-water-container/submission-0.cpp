class Solution {
public:
    int maxArea(vector<int>& nums) {
        vector<int> l;
        vector<int> r;
        int ll=0, rr=0;
        for(auto it:nums){
            ll = max(ll, it);
            l.push_back(ll);
        }
        for (int it=nums.size()-1; it>=0; --it) {
         
            rr = max(rr, nums[it])   ;
            r.push_back(rr);
        }

        int le=0, ri=nums.size()-1;
        int ans=0;
        while(le<ri){
            int h = min(nums[le], nums[ri]);
            ans = max(ans, h*(ri-le));
            if(nums[le] < nums[ri]) le++;
            else ri--;
        }
        return ans;

    }
};
