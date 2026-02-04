#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin>>n;
    
    vector<pair<int,int>>point(n);
    for(int i=0;i<n;i++) cin>>point[i].first>>point[i].second;
    
    sort(point.begin(),point.end(),[](const pair<int,int>&a,pair<int,int>&b){
        if(a.second==b.second){
            return a.first<b.first;
}
        return a.second<b.second;
    });
    
    for(int i=0;i<n;i++){
      cout<<point[i].first<<' '<<point[i].second<< '\n';
    }

    return 0;
}