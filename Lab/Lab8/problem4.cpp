#include <fstream>

using namespace std;

int main() {
    ifstream fin("input.txt");
    string line;
    getline(fin, line);
    int n = stoi(line);

    ofstream fout("output.txt");
    for(int i = 2; i < n; i = i + 2) {
        if(i == 38) continue;
        if(i > 70) break;
        fout << i << " ";
    }

    fin.close();
    fout.close();
}