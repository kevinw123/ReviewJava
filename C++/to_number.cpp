#include <iostream>
#include <string>

using namespace std;

int to_number(string str){
    if(str == "")
        return 0;
    else{
        int array[] = {1,2,3,4,5,6,7,8,9};
        int i  = (int) str.front();
        if( i > 48 && i < 57){
            return array[i-49] + to_number(str.substr(1));
        }
        else{
            return 0 + to_number(str.substr(1));
        }
    }
}
int main(int argc, const char * argv[]) {
    int i = to_number("3ac4");
    cout << i;
    //cout << endl;
    //cout << j;
    return 0;
}
