#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	  int a,b,sum=0,sub=0;
    float c,d,s=0,su=0;
    scanf("%d%d",&a,&b);
    sum= a+b;
    sub=a-b;
    printf("%d %d\n",sum,sub);
    scanf("%f%f",&c,&d);
    s=c+d;
    su=c-d;
    printf("%0.1f %0.1f",s,su);
    
    return 0;
}
