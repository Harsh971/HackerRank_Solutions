import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String [] splitLine;
        String s;
        int i;
        while(sc.hasNextLine()){
            splitLine = sc.nextLine().split(" ");
            s = splitLine[0];
            i = Integer.parseInt(splitLine[1]);
            System.out.printf("%-15s%03d\n",s,i);
        }
        System.out.println("================================");
        sc.close();
    }
}