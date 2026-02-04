#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin>>n;
    vector<int>time(n);
    
    for(int i=0;i<n;i++){
        cin>>time[i];
    }
    
    sort(time.begin(),time.end());
    
    int progressSum=0;
    int totalSum=0;
    
    for(int i=0;i<n;i++){
      progressSum+=time[i];
      totalSum+=progressSum;
    }
    cout<<totalSum;
    return 0;
}