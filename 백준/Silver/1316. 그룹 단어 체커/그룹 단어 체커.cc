#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int count=0;
    
    for(int i=0;i<n;i++){
        string s;
        cin>>s;
        
        char last=0;
        vector<int>seen(26,0);
        bool isExist=false;
        
        for(char c:s){
            int idx=c-'a';
            
            if(c!=last && seen[idx] == 1){
                isExist=true;
                break;
            }
            seen[idx]=1;
                last=c;
    
        }
        if(!isExist) count++;
        
    }
    cout<<count;
    return 0;
}