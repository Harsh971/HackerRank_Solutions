import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.replaceAll("[^a-z A-Z]"," ");
       s=s.replaceAll("\\s+"," ");
       s=s.trim();

        String [] arr=s.split(" ");

        if(s.length()>0){
        System.out.println(arr.length);
        for (String i:arr)
        {
        System.out.println(i);
        }
        }
        else
        System.out.println(0);
        scan.close();
    }
}