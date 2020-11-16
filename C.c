#include<stdio.h>
int main()
{
    double c,b,a;
    scanf("%lf",&a);
    if(a >= 0.00 && a <= 2000.00)
    {
        printf("Isento\n");
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        printf("R$ %.2lf\n", c);
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        printf("R$ %.2lf\n", c);
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        printf("R$ %.2lf\n", c);
    }
    return 0;
}
