#include <iostream>

using namespace std;

int is_prime_ans[10000];

bool is_prime(int n) {
    if(n == 1 || is_prime_ans[n] == 0)
        return false;

    for(int i = 2; i < n; i++)
        if(n % i == 0) {
            is_prime_ans[n] = 0;
            return false;
        }
    is_prime_ans[n] = 1;
    return true;
}

void print_primes_in(int a, int b) {
    for(int p = a; p <= b; p++)
        if(is_prime(p)) cout << p << " ";
    cout << endl;
}

int main() {
    fill_n(is_prime_ans, 10000, -1);
    int n, a, b;
    cin >> n;
    cout << is_prime(n) << endl;
    cin >> a >> b;
    print_primes_in(a, b);
}