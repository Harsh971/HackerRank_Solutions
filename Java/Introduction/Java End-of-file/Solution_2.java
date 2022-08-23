import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int count = 1;
        try(Scanner in = new Scanner(System.in))
        {
            while(in.hasNext())
            {
                System.out.println(count + " " + in.nextLine());
                ++count;
            }
        }
    }
}