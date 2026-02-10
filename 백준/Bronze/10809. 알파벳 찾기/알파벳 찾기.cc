#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;

    vector<int> position(26, -1);

    for (int i = 0; i < (int)s.length(); i++) {
        int idx = s[i] - 'a';          
        if (position[idx] == -1) {     
            position[idx] = i;      
        }
    }

    for (int i = 0; i < 26; i++) {
        cout << position[i] << ' ';
    }

    return 0;
}
