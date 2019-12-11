#include <iostream>

using namespace std;

#define PI 3.14159
#define AREA(r) PI*(r)*(r) // When using function-like #define, always enclose parameters with parentheses

inline double area(double r){ return PI * r * r; }

int main() {
    float r;
    cin >> r;
    cout << AREA(r) << endl;
    cout << area(r) << endl;
}