import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N[][]=new int[6][6];
       for(int i=0; i<6; i++){
       for(int j=0; j<6; j++){
       N[i][j]=sc.nextInt();
       }
       }
       int high=-100000000;
       for(int m=0; m<4; m++){
       for(int n=1; n<5; n++){
       int one=N[m][n-1];
       int one1=N[m][n];
       int one2=N[m][n+1];
       int one3=N[m+1][n];
       int one4=N[m+2][n-1];
       int one5=N[m+2][n];
       int one6=N[m+2][n+1];
       int add=one+one1+one2+one3+one4+one5+one6;
       if(add>high){
       high=add;
       }
      
       }
           
       }
       System.out.println(high);
}
}