#include <iostream>

using namespace std;

int factorial(int num) {
    int fac = 1;
    for (int i = 1; i != num+1; i++) {
        fac *= i;
    }
    return fac;
}

int main() {
    int num;
    cout<<"Enter a Number";
    cin>>num;

    int fac = factorial(num);
    cout<<"The factorial of the number is " + fac;
    return 0;
}
