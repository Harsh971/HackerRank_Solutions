import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usNumbers = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaNumbers = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.printf("US format = %s%n", usNumbers.format(payment));
        System.out.printf("India format = %s%n", indiaNumbers.format(payment));
    }
}