#include <iostream>
#include <string>
#include <sstream>

using namespace std;

string repeater(string str){
    if(str == ""){
        return "";
    }
    else{
        char c = str.front();
        stringstream ss;
        string s;
        ss << c;
        ss >> s;
        return s + s + repeater(str.substr(1));
    }
}

int main(int argc, const char * argv[]) {
    string i = repeater("TESTING");
    string j = repeater("hello");
    cout << i;
    cout << endl;
    cout << j;
    return 0;
}
