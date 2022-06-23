#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch,s[50],sen[50];
    scanf("%c\n%s\n%[^\n]",&ch,&s,&sen);
    printf("%c\n%s\n%s",ch,s,sen);
   
    return 0;
}
