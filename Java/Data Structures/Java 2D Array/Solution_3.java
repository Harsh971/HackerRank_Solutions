import java.io.*;
import java.util.*;

public class Solution {

    static int[][] data;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        data = new int[6][6];
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                data[x][y] = scan.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int cur;
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                cur = getHour(x, y);
                if (cur > max)
                    max = cur;
            }
        }
        System.out.println(max);
    }
    
    static int getHour(int x, int y) {
        int sum = 0;
        sum += data[x-1][y-1]; //top
        sum += data[x-1][y];
        sum += data[x-1][y+1];
        
        sum += data[x][y]; //middle
        
        sum += data[x+1][y-1]; //bottom
        sum += data[x+1][y];
        sum += data[x+1][y+1];
        return sum;
    }
}