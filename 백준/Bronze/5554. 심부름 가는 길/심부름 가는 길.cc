#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); 
    cin.tie(0);
    int time=0;
    int sum=0;
    for (int i=0;i<4;i++){
        cin>>time;
        sum+=time;
    }
    cout<<sum/60<<'\n'<<sum%60;
    
    return 0;
}