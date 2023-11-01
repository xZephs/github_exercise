#include <math.h>
#include <stdio.h>

int main(){
    int a = 2, b = 4, c = 6, x;
    x = (-b + sqrt(pow(b,2) - 4 * a * c))/(2*a);
    printf("%d\n", x);
    x = (-b - sqrt(pow(b,2) - 4 * a * c))/(2*a);
    printf("%d\n", x);
    return 0;
}