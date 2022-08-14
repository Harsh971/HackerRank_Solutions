import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Pair> pairs = new HashSet<>();
        final int N = s.nextInt();
        
        for(int i = 0; i < N; i++) {
            String first = s.next();
            String second = s.next();
            
            pairs.add(new Pair(first, second));
            System.out.println(pairs.size());
        }       
    }
    
    public static class Pair {
        String first, second;
        Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }
        
        @Override public int hashCode() {
            return first.hashCode() + second.hashCode() * 4 % 4;
        }

        @Override public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Pair)) {
                return false;
            }

            Pair otherPair = (Pair) other;
            return (first.equals(otherPair.first) && second.equals(otherPair.second))
                || (first.equals(otherPair.second) && second.equals(otherPair.first));
        }
        
    }
}