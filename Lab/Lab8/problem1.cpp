#include <iostream>
#include <string>

using namespace std;

int main() {
    string name;
    cin >> name;
    if(name == "Youngki") cout << "Hello, Professor!" << std::endl;
    else cout << "Hello, " << name << "!" <<std::endl;
}