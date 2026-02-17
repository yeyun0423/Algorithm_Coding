#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    
    vector<pair<int,string>>ageName;
    
    int age;
    string name;
    
    for(int i=0;i<n;i++){
        cin>>age>>name;
        ageName.push_back({age,name});     
    }
    
    stable_sort(ageName.begin(),ageName.end(),[](auto a,auto b){
        return a.first<b.first;
    });
    
    for(int i=0;i<n;i++){
    cout<<ageName[i].first<<" "<<ageName[i].second<<'\n'; 
    }
     
    return 0;
}