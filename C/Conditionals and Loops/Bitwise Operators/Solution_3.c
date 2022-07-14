#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
    int i,j,max_and=0,max_or=0,max_xor=0;
    for(i=1;i<=n;i++)
    {
        for(j=i+1;j<=n;j++)
        {
            int x=i&j,y=i|j,z=i^j;
            if(x<k & x>max_and)
                 max_and=x;
            if(y<k & y>max_or)
                 max_or = y;
            if(z<k & z>max_xor)
                 max_xor = z;       

        }
    }
    printf("%d\n%d\n%d",max_and,max_or,max_xor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
    return 0;
}
