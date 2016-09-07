#include <iostream>
#include <string>

using namespace std;

int stringLength(string str){
    if(str == ""){
        return 0;
    }
    else{
        return 1 + stringLength(str.substr(1));
    }
}
int main(int argc, const char * argv[]) {
    int i = stringLength("TESTINGGG12312");
    cout << i;
    return 0;
}
