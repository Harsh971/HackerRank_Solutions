import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Map<String,Integer> name_ph = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            name_ph.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            System.out.println(name_ph.containsKey(s)?s+"="+name_ph.get(s):"Not found");
        }
    }
}