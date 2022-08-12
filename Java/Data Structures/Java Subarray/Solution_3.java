import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int negCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int subArr[] = null;
                subArr = Arrays.copyOfRange(numbers, i, j+1);
               
                int sum = sumArray(subArr);
               
                if(sum < 0){
                    negCount++;
               
                }
            }
        }
        System.out.println(negCount);
        sc.close();
    }
    public static int sumArray(int [] arr){
        int sum = 0;
        if(arr != null){
            for(int i = 0; i < arr.length; i++){
                sum+=arr[i];
            }
        }
        return sum;
    }
}