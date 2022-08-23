import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        int a, b, n;
        for (int t = 0; t < tests; t++) {
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
            loop(a, b, n);
        }
    }
    
    static void loop(int a, int b, int n) {
        int sum = a;
        for (int x = 0; x < n; x++) {
            sum += b * (1<<x);
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}