import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        String a [] = asdf.nextLine().split("[ \"!,?._'@\". ]");
        int size = a.length;        
        for(int i = 0; i < a.length; i++){
            if(a[i].compareTo("") == 0){
                size = size - 1;
            }
            
        }
        System.out.println(size);
        for(int i = 0; i < a.length; i++){
            if(a[i].compareTo("") != 0){
                System.out.println(a[i]);
            }
            
        }
    }
}