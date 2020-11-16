#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    double c,b,a;
    cin>>a;
    if(a >= 0.00 && a <= 2000.00)
    {
        cout<<"Isento"<<endl;
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        cout<<"R$ "<<fixed<<setprecision(2)<<c<<endl;
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        cout<<"R$ "<<fixed<<setprecision(2)<<c<<endl;
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        cout<<"R$ "<<fixed<<setprecision(2)<<c<<endl;
    }
    return 0;
}
