#include <iostream>
#include <string>

using namespace std;

int factorial(int n) {
    if (n == 0)
        return 1;
    else if( n < 0){
        throw invalid_argument("n must be greater than or equal 0");
    }
    else
        return n * factorial(n - 1);
}

int main(int argc, const char * argv[]) {
    int i = factorial(-4);
    cout << i;

    return 0;
}
