class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans;
        long long tot = 1;
        int zc = 0;

        for(int it: nums){
            if(it!=0)
                tot *=it;
            else
                zc++;
        }

        cout<<zc;
        if(zc>1) {
            for(int i=0; i<nums.size(); i++) ans.push_back(0);
            return ans;
        }

        for(int it:nums){
            if(zc==0){
                ans.push_back((int)(tot/it));
            }
            else{
                if(it!=0)
                    ans.push_back(0);
                else 
                    ans.push_back((int)tot);
            }
            
        }
        return ans;
    }
};
