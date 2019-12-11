#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    for(int i = 2; i < n; i = i + 2) {
        if(i == 38) continue;
        if(i > 70) break;
        cout << i << " ";
    }
    cout << endl;
}