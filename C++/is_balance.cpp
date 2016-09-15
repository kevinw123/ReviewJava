#include "is_balance.hpp"
#include <stack>
#include <string>
#include <iostream>
using namespace std;

//Set of open and close parentheses
const string OPEN = "([{";
const string CLOSE = "(]}";

//string::npos is not found.
//So if we are able to find the ch in OPEN then return true
bool is_open(char ch){
    return OPEN.find(ch) != string::npos;
}

bool is_close(char ch){
    return CLOSE.find(ch) != string::npos;
}

bool is_balanced(const string& expression){
    stack<char> s;
    bool balanced = true;
    string::const_iterator iter = expression.begin();
    while(balanced && (iter != expression.end())){
        char next_ch = *iter;
        if(is_open(next_ch)){
            s.push(next_ch);
        } else if(is_close(next_ch)){
            if(s.empty()){
                balanced = false;
            } else {
                char top_ch = s.top();
                s.pop();
                balanced = OPEN.find(top_ch) == CLOSE.find(next_ch);
            }
        }
        ++iter;
    }
    return balanced && s.empty();
}

int main(){
    cout << "Enter an expression\n";
    string expression;
    while(getline(cin,expression) && (expression != "")){
        cout << expression;
        if(is_balanced(expression)){
            cout << " is balanced\n";
        } else {
            cout << " is not balanced\n";
        }
        cout << "Enter another expression: ";
    }
    return 0;
}