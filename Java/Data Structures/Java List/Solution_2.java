import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List L = new ArrayList();
        for(int i = 0; i < N; i++)
            L.add(i,sc.nextInt());
        int Q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < Q; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equalsIgnoreCase("Insert")){
                String arr[] = s2.split(" ");
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                L.add(x,y);
            }
            if(s1.equalsIgnoreCase("Delete")){
                int x = Integer.parseInt(s2);
                L.remove(x);
            }
        }
        Iterator itr = L.iterator();
        while(itr.hasNext()){
            int x = (int)itr.next();
            System.out.print(x + " ");
        }
        sc.close();
    }
}