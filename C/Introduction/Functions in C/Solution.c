#include <stdio.h>

int main() {
    int a, b, c, d, m1, m2;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = (m1=a>b?a:b)>(m2=c>d?c:d)?m1:m2;
    printf("%d", ans);
    
    return 0;
}
