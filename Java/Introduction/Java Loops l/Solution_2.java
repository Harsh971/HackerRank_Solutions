import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(input + " x " + i + " = " + input*i);
        }
    }
}