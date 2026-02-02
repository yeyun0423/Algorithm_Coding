#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    vector <int> numbers(31);
    
    for(int i=1;i<31;i++){
        int n;
        cin>>n;
        numbers[n]=n;
    }
    
    for(int i=1;i<31;i++){
        if(numbers[i]==0){
            cout<<i<<'\n';
        }
    }
    
    return 0;
}