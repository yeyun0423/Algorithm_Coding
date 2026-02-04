#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin>>n;
    
    vector<int>A(n),B(n);
    for(int i=0;i<n;i++)cin>> A[i];
    for(int i=0;i<n;i++) cin>>B[i];
    
    sort(A.begin(),A.end());
    sort(B.begin(),B.end());
    
    int sum=0;
    
    for(int i=0;i<n;i++){
    sum+=A[i]*B[(n-1)-i];
    }
    cout<<sum;
    return 0;
}