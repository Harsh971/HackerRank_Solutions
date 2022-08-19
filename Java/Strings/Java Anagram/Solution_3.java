import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       if(A == null || B == null) {
           if(A != null || B != null) {
               return false;
           }
           return true;
       }
       A = A.toLowerCase();
       B = B.toLowerCase();
       char[] aArr = A.toCharArray();
       char[] bArr = B.toCharArray();
       Arrays.sort(aArr);
       Arrays.sort(bArr);
       String aSorted = new String(aArr);
       String bSorted = new String(bArr);
       
       return aSorted.equals(bSorted); 
       
       
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}