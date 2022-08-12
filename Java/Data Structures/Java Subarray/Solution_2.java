import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        int range = sc.nextInt();        
        int[] numbers = new int[range];
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j < numbers.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k = k + 1){
                    sum = sum + numbers[k];
                }
                if (sum < 0){
                    counter = counter + 1;
                }
            }
            
        }
    
       System.out.println(counter);
}
}