#include <iostream>
#include <string>

using namespace std;

double power(double x, int n) {
    if (n == 0)
        return 1;
    else if( n > 0){
        return x * power(x, n-1);
    }
    else
        return 1.0/ power(x, -n);
}

int main(int argc, const char * argv[]) {
    double i = power(2,7);
    cout << i;

    return 0;
}
