#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void factorial(int n) {
    int a=1;
    for(int i=n; i>0; i--)
    {
        a*=i;
    }
    printf("%d",a);
}

int main()
{
    int n;
    scanf("%d",&n);
    factorial(n);
    return 0;
}

