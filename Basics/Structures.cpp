#include<iostream>
using namespace std;

struct Rectangle{
    int length;
    int breadth;
};
// struct Rectangle r1;    // global variable
int main(){
     struct Rectangle r1={12,16};    // local variable, only accessible inside main method.
    //  printf("%lu", sizeof(r1));
    r1.length=15;
    r1.breadth=17;
    cout<<r1.length<<endl;
    cout<<r1.breadth<<endl;
     return 0;
}