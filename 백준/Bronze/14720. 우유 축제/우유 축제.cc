#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin>>n;
    
    int nextMilk=0;
    int sum=0;
    
    for(int i=0;i<n;i++){
        int milk;
        cin>>milk;
        
        if(milk==nextMilk){
            sum++;
            nextMilk=(milk+1)%3;
        }
    }
    cout<<sum;
    return 0;
}