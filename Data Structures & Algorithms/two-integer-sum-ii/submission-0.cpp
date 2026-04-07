class Solution {
public:
    vector<int> twoSum(vector<int>& num, int target) {
        int n=num.size();
        int l=0,r=n-1;

        while(l<r){
            int x = num[l]+num[r];

            if(x==target) return {l+1, r+1};
            else if(x>target) r--;
            else l++;
        }
        return {-1, -1};
    }
};
