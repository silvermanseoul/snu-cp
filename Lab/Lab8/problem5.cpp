#include <iostream>

using namespace std;

void swap3(int *a, int *b, int *c) {
    int temp = *a;
    *a = *b;
    *b = *c;
    *c = temp;
}

void swap3(int &a, int &b, int &c) {
    int temp = a;
    a = b;
    b = c;
    c = temp;
}
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    swap3(&a, &b, &c);
    cout << a << b << c << endl;
    swap3(a, b, c);
    cout << a << b << c << endl;
}