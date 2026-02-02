#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); 
    cin.tie(0);
    int testCaseCount;
    cin>>testCaseCount;
    
    for(int i=0;i<testCaseCount;i++){
     int money;
     cin>>money;
     
     int Quarter=money/25;
      money%=25;
        
      int Dime=money/10;
      money%=10;
        
      int Nickel=money/5;
       money%=5;
     
      int Penny=money;
       
     cout<<Quarter<<' '<< Dime<<' '<<Nickel<<' '<<Penny<< '\n';
    }
    
    return 0;
}