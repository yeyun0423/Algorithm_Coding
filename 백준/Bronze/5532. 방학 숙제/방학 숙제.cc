#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); 
    cin.tie(0);
    int L,A,B,C,D;
    cin>>L>>A>>B>>C>>D;
    int Kday=(A+C-1)/C;
    int Mday= (B+D-1)/D;   
    cout<<L-max(Kday,Mday);
    return 0;
}