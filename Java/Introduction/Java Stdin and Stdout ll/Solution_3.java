import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String intLine = s.nextLine();
        String floatLine = s.nextLine();
        String sentence = s.nextLine();
        System.out.println("String: " + sentence);
        System.out.println("Double: " + Double.parseDouble(floatLine));
        System.out.println("Int: " + Integer.parseInt(intLine));
    }
}