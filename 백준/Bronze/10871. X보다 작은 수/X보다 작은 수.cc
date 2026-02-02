#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n,x;
    cin>>n>>x;
    
    vector <int> numbers(n);
    
    for(int i=0;i<n;i++){
        cin>>numbers[i];
    }
    
    for(int i=0;i<n;i++){
        if(x>numbers[i]){
            cout<<numbers[i]<<' ';
        }
    }
    
    return 0;
}