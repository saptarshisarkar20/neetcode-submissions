class Solution {
public:
    int search(vector<int>& nums, int tg) {
        int l=0, r=nums.size()-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == tg) return mid;

            if(nums[mid]<tg){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
};
