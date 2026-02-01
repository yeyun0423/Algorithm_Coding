#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); 
    cin.tie(0);
    string line;
    while(1){
        getline(cin,line);
        if(line=="#") break;
        int count=0;
        for(char c:line){
            if(c>='A'&&c<='Z'){
                c=c-'A'+'a';
            }
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        cout<<count<<'\n';
    }
    return 0;
}