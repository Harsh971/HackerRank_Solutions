import java.io.*;
import java.util.*;

public class Solution {

   
         public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
        Solution. */
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(Exception e){
            if(e instanceof java.lang.ArithmeticException)
                System.out.println(e.toString());
            if(e instanceof java.util.InputMismatchException)
                System.out.println("java.util.InputMismatchException");
        }
    }
    
}
