#include<iostream> // C++ library that provides input/output tools to perform operations.
using namespace std; // helps in writing names without std:: 

int main(){
    int A[5];  // Array Declaration.
    A[0]=12;
    A[1]=15;
    A[2]=25;
    cout<<sizeof(A);  // prints the size consumed by the array in the memory. (int= 4 bytes, 5*4=20.)
    return 0; 
}