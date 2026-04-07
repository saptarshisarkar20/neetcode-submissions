class Solution {
public:
    bool isPalindrome(string s) {
        int n = s.length();
        int i=0, j=n-1;

        while(i<j){
            while((tolower(s[i])<'a' || tolower(s[i])>'z') && (tolower(s[i])<'0' || tolower(s[i])>'9') )i++;
            while((tolower(s[j])<'a' || tolower(s[j])>'z') && (tolower(s[j])<'0' || tolower(s[j])>'9') )j--;
            if(i<j && tolower(s[i])!=tolower(s[j])){
            // cout<<s[i]<<"|"<<s[j];
             return false;
            }
            i++;
            j--;
        }
        return true;
    }
};
