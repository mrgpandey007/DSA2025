#include <vector>
#include <algorithm>
#include <iostream> 

using namespace std;

class Solution{
    public:
    vector<vector<int>>Merge(vector<vector<int>> & Arr){
        sort(Arr.begin(),Arr.end());
        int n=Arr.size();
        vector<vector<int>> ans;
        for(int i=0;i<n;i++){
            int start=Arr[i][0];
            int end=Arr[i][1];
            if(ans.empty()||ans.back()[1]>=end){
                ans.push_back(Arr[i]);
            }else{
                ans.back()[1]=max(ans.back()[1],Arr[i][1]);
            }
        }
        return ans;
    }
};

int main(){
    Solution sol;
    vector<vector<int>>Arr={{1,3},{2,6},{8,10},{15,18}};
    vector<vector<int>>Func=sol.Merge(Arr);
    for (int i = 0; i < Func.size(); i++) {
        cout << "[" << Func[i][0] << ", " << Func[i][1] << "] ";
    }
    cout << endl;
    
}