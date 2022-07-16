#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>

int main() {

int n;
scanf("%d", &n);
int len = 2*n-1;
int min1,min2,min;
  // Complete the code to print the pattern.
  // for rows
  for (int i=1; i <=len; i++) {
      // for col
      for (int j=1; j<=len; j++) {
        // min diff btn vertical sides
        min1 = i<=len-i ? i -1 : len-i;
        // min diff btn horizontal sides
        min2 = j<=len-j ? j -1: len-j;
        // min diff btn vertical & horizontal sides
        min = min1<=min2 ? min1 : min2;
        // print  
        printf("%d ",n-min);
      }
      printf("\n");
  }
return 0;
}
