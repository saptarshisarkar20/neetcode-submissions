class Solution {
public:
    bool validateRows(vector<vector<char>>& board, int r){
        vector<bool> v = {0,0,0,0,0,0,0,0,0};
        for(int i=0; i<9; i++){
            if(board[r][i] != '.'){
                // cout<<board[r][i] -'1'<<endl;
                if(v[board[r][i] -'1']!=0) return false;
                v[board[r][i] -'1'] = 1;
            }
        }
        return true;
    }

    bool validateCols(vector<vector<char>>& board, int c){
        vector<bool> v = {0,0,0,0,0,0,0,0,0};
        for(int i=0; i<9; i++){
            if(board[i][c] != '.'){
                if(v[board[i][c]-'1']!=0) return false;
                v[board[i][c]-'1'] = 1;
            }
        }
        return true;
    }

    bool validateBoxs(vector<vector<char>>& board, int r, int c){
        vector<bool> v = {0,0,0,0,0,0,0,0,0};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                char x = board[r+i][c+j];
                if(x!='.'){
                    if(v[x-'1']!=0) return false;
                    v[x-'1'] = 1;
                }
            }
        }
        return true;
    }

    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0; i<9; i++){
            if(!validateRows(board, i)) return false;
        }
        cout<<1;
        for(int i=0; i<9; i++){
            if(!validateCols(board, i)) return false;
        }
        cout<<2;

        for(int i=0; i<9;){
            for(int j=0; j<9;){
                if(!validateBoxs(board, i, j)) return false;
                j+=3;
            }
            i+=3;
        }
        return true;
    }
};
