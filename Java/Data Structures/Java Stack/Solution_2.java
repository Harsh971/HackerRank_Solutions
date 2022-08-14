import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private final static Map<String, String> BRACKETS = createBracketsMap();
    private final static Set<String> CLOSING = new HashSet<String>(Arrays.asList("]", "}", ")"));
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String data = in.next().trim();
            System.out.println(isBalanced(data));
        }
    }
    
    private static Map<String, String> createBracketsMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("{", "}");
        map.put("[", "]");
        map.put("(", ")");
        return map;
    }
    
    public static boolean isBalanced(String data) {
        if (data.equals("")) return true;
        Deque<String> stack = new ArrayDeque<String>();
        for (int i = 0; i < data.length(); i++){
            String c = data.substring(i,i+1);  
            if (CLOSING.contains(c)) {
                if (stack.isEmpty()) return false;
                String op = stack.pop();
                if (!BRACKETS.get(op).equals(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}