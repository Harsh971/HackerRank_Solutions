#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int find_nth_term(int n, int a, int b, int c) {
  //Write your code here.
    int tmp=0;
    if(n==1){
        return a;
    }
    else if(n==2){
        return b;
    }
    else if(n==3){
        return c;
    }
    tmp=c;
    c = find_nth_term(n-1,a,b,c);
    c += find_nth_term(n-2,a,b,c);
    c += find_nth_term(n-3,a,b,c);
    return find_nth_term(n--,c,tmp,b);

}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}