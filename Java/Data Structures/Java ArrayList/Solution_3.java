import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList< Integer >> arr = new ArrayList<ArrayList< Integer >>();        
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for (int n=0 ; n<N ; ++n) {
            
            int D = sc.nextInt();
            ArrayList< Integer > a = new ArrayList< Integer >();
            
            for (int d=0 ; d<D ; ++d) {
                a.add(sc.nextInt());   
            }
            
            arr.add(a);            
        }
        
        int Q = sc.nextInt();
        for (int q=0 ; q<Q ; ++q) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            try {
                System.out.println(arr.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}