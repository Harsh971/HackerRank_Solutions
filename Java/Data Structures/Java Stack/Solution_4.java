import java.io.*;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    StringTokenizer st;
    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) throws NumberFormatException, IOException {
        final Solution solver = new Solution();
        long time = System.currentTimeMillis();
        solver.open();
        solver.solve();
        //System.out.println("Spend time:" + (System.currentTimeMillis() - time));
        solver.close();
    }

    public void open() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        //in = new BufferedReader(new FileReader("input.txt"));
        //out = new PrintWriter(new FileWriter("output.txt"));
    }

    boolean hasMoreTokens() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = in.readLine();
            if (line == null)
                return false;
            st = new StringTokenizer(line);
        }
        return true;
    }

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = in.readLine();
            if (line == null)
                return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    public int nextInt() throws NumberFormatException, IOException {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws NumberFormatException, IOException {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }

    boolean between(final BigInteger n, long from, long to) {
        return n.compareTo(BigInteger.valueOf(from)) > -1 &&
                n.compareTo(BigInteger.valueOf(to)) < 1;
    }

    boolean check(final String s) {
        final Stack<Character> stack = new Stack<>();

        for (final char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }

        return stack.isEmpty();
    }

    public void solve() throws NumberFormatException, IOException {
        String s;
        while ((s = in.readLine()) != null) {
            out.println(check(s));
        }
    }

    public void close() {
        out.flush();
        out.close();
    }
}