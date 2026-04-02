class Solution {
public:

    string encode(vector<string>& s) {
        if(s.size() == 0) return "";
        string ans = "|";
        for(int i=0; i<s.size(); i++) ans+=(s[i]+"|");
        return ans;
    }

    vector<string> decode(string s) {
        vector<string> ans;
        cout<<s<<endl;
        if(s=="") return ans;
        int p=0;
        for(int i=1; i<s.length(); i++){
            if(s[i]=='|'){
                string x = "";
                for(int j=p+1; j<i;j++) x+=s[j];
                ans.push_back(x);
                p=i;
            }
        }

        return ans;
    }
};
